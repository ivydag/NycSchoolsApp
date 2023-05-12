package com.ivy.dev.nycschoolsapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ivy.dev.nycschoolsapp.data.local.satresults.SATResultsDao
import com.ivy.dev.nycschoolsapp.data.local.satresults.SATResultsEntity
import com.ivy.dev.nycschoolsapp.data.local.schools.SchoolsDao
import com.ivy.dev.nycschoolsapp.data.local.schools.SchoolsEntity

@Database(entities = [SchoolsEntity::class, SATResultsEntity::class], version = 1)
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