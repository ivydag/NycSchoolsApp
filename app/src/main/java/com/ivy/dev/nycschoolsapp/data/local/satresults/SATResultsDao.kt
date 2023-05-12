package com.ivy.dev.nycschoolsapp.data.local.satresults

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SATResultsDao {
    @Query("SELECT * FROM SATResultsEntity")
    fun getSATResults(): List<SATResultsEntity>

    @Insert
    fun insertAllSAT(vararg satResults: SATResultsEntity)
}
