package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.local.satresults.SATResultsEntity
import com.ivy.dev.nycschoolsapp.data.local.schools.SchoolsEntity
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults


interface DatabaseHelper {

    suspend fun getSchools(): List<SchoolsEntity>

    suspend fun insertSchool(schools: SchoolsEntity)

    suspend fun getSATResults(): List<SATResultsEntity>

    suspend fun insertSATResult(satResults: SATResultsEntity)

    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>

}