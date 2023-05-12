package com.ivy.dev.nycschoolsapp.data.local.satresults

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SATResultsEntity(
    @PrimaryKey val dbn: String,
    val num_of_sat_test_takers: Int,
    val sat_critical_reading_avg_score: Int,
    val sat_math_avg_score: Int,
    val sat_writing_avg_score: Int
)