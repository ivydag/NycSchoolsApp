package com.ivy.dev.nycschoolsapp.data.local.schools

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SchoolsDao {
    @Query("SELECT * FROM SchoolsEntity")
    fun getSchools(): List<SchoolsEntity>

    @Insert
    fun insertAllSchools(vararg schools: SchoolsEntity)
}