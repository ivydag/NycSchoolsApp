package com.ivy.dev.nycschoolsapp.data.remote

import javax.inject.Inject


class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper(apiService) {
    override suspend fun getSchools() = apiService.getSchools()

    override suspend fun getSATResults() = apiService.getSATResults()
}