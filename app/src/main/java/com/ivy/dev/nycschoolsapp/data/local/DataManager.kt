package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults


interface DataManager {
    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults>
}