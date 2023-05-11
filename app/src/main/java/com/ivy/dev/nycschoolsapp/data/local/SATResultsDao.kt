package com.ivy.dev.nycschoolsapp.data.local

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ivy.dev.nycschoolsapp.data.models.SATResults

interface SATResultsDao {
    @Query("SELECT * FROM sat_results")
    suspend fun getSATResults(): List<SATResults>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSATResult(satResult: SATResults)

    @Delete
    suspend fun deleteSATResult(satResult: SATResults)
}
