package com.ivy.dev.nycschoolsapp.data.remote

import com.ivy.dev.nycschoolsapp.data.models.SATResultsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import retrofit2.http.GET

interface ApiService {

    @GET("DOE-High-School-Directory-2017.json")
    suspend fun getSchools(): List<SchoolsItem>

    @GET("SATResults.json")
    suspend fun getSATResults(): List<SATResultsItem>

}