package com.ivy.dev.nycschoolsapp.data.repository

import com.ivy.dev.nycschoolsapp.data.models.SATResultsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults

interface Repository {

    suspend fun getSchools():List<SchoolsItem>
    suspend fun getSATResults() : List<SATResultsItem>
    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>
}