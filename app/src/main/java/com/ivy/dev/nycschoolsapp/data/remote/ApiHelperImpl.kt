package com.ivy.dev.nycschoolsapp.data.remote

import com.ivy.dev.nycschoolsapp.data.models.SATResultsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults

class ApiHelperImpl(private val apiService: ApiService): ApiHelper {

     override suspend fun getSchools(): List<SchoolsItem> = apiService.getSchools()

     override suspend fun getSATResults(): List<SATResultsItem> = apiService.getSATResults()

    // open suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>
    override suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults> {
        val schools = getSchools()
        val satResults = getSATResults()

        val schoolsWithSATResults = mutableListOf<SchoolsWithSATResults>()
        for (school in schools) {
            val satResult = satResults.find { it.dbn == school.dbn }
            if (satResult != null) {
                schoolsWithSATResults.add(SchoolsWithSATResults(school, listOf(satResult)))
            }
        }
        return schoolsWithSATResults
    }
}