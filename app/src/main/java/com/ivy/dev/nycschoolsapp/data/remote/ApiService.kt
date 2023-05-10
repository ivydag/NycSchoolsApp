package com.ivy.dev.nycschoolsapp.data.remote

import com.ivy.dev.nycschoolsapp.data.models.SATResults
import com.ivy.dev.nycschoolsapp.data.models.Schools
import retrofit2.http.GET

interface ApiService {

    @GET("DOE-High-School-Directory-2017.json")
    suspend fun getSchools(): List<Schools>

    @GET("SATResults.json")
    suspend fun getSATResults(): List<SATResults>

}