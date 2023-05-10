package com.ivy.dev.nycschoolsapp.data.remote

open class ApiHelper(private val apiService: ApiService) {

    open suspend fun getSchools() = apiService.getSchools()

    open suspend fun getSATResults() = apiService.getSATResults()
}