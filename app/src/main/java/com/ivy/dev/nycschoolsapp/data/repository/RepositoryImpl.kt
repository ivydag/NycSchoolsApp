package com.ivy.dev.nycschoolsapp.data.repository

import com.ivy.dev.nycschoolsapp.data.models.SATResultsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults
import com.ivy.dev.nycschoolsapp.data.remote.ApiHelper

class RepositoryImpl(private val apiHelper: ApiHelper) : Repository {
    override suspend fun getSchools(): List<SchoolsItem> {
        return apiHelper.getSchools()
    }

    override suspend fun getSATResults(): List<SATResultsItem> {
        return apiHelper.getSATResults()
    }

    override suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults> {
        return apiHelper.getSchoolsWithSATResults()
    }
}