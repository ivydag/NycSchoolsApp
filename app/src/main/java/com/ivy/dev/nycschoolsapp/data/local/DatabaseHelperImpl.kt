package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.models.SATResults
import com.ivy.dev.nycschoolsapp.data.models.Schools
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults
import javax.inject.Inject

class DatabaseHelperImpl @Inject constructor(private val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getSchools(): List<Schools> = appDatabase.schoolDao().getSchools()

    override suspend fun insertSchool(school: Schools) = appDatabase.schoolDao().insertSchool(school)

    override suspend fun deleteSchool(school: Schools) = appDatabase.schoolDao().deleteSchool(school)

    override suspend fun getSATResults(): List<SATResults> = appDatabase.satResultDao().getSATResults()

    override suspend fun insertSATResult(satResult: SATResults) = appDatabase.satResultDao().insertSATResult(satResult)

    override suspend fun deleteSATResult(satResult: SATResults) = appDatabase.satResultDao().deleteSATResult(satResult)

    override suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults> {
        TODO("Not yet implemented")
    }
}