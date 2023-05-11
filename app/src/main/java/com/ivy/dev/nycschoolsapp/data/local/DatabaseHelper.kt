package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.models.SATResults
import com.ivy.dev.nycschoolsapp.data.models.Schools


interface DatabaseHelper {

    suspend fun getSchools(): List<Schools>

    suspend fun insertSchool(schools: Schools)

    suspend fun deleteSchool(schools: Schools)

    suspend fun getSATResults(): List<SATResults>

    suspend fun insertSATResult(satResults: SATResults)

    suspend fun deleteSATResult(satResults: SATResults)

    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>

}