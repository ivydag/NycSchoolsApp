package com.ivy.dev.nycschoolsapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ivy.dev.nycschoolsapp.data.models.Schools

@Dao
interface SchoolsDao {
    @Query("SELECT * FROM schools")
    suspend fun getSchools(): List<Schools>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: Schools)

    @Delete
    suspend fun deleteSchool(school: Schools)
}