package com.ivy.dev.nycschoolsapp.data.remote


import com.ivy.dev.nycschoolsapp.data.models.SATResultsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults

interface ApiHelper {
    suspend fun getSchools(): List<SchoolsItem>
    suspend fun getSATResults(): List<SATResultsItem>
    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>
}