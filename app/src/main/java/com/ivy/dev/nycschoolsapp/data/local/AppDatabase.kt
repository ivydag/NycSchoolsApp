package com.ivy.dev.nycschoolsapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ivy.dev.nycschoolsapp.data.models.SATResults
import com.ivy.dev.nycschoolsapp.data.models.Schools

@Database(entities = [Schools::class, SATResults::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun schoolDao(): SchoolsDao
    abstract fun satResultDao(): SATResultsDao

    // abstract fun satResultDao(): SATResultsDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "my_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}