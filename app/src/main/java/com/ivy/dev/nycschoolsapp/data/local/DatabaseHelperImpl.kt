package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.local.satresults.SATResultsEntity
import com.ivy.dev.nycschoolsapp.data.local.schools.SchoolsEntity
import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults
import javax.inject.Inject

class DatabaseHelperImpl @Inject constructor(private val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getSchools(): List<SchoolsEntity> = appDatabase.schoolDao().getSchools()

    override suspend fun insertSchool(school: SchoolsEntity) = appDatabase.schoolDao().insertAllSchools(school)

    override suspend fun getSATResults(): List<SATResultsEntity> = appDatabase.satResultDao().getSATResults()

    override suspend fun insertSATResult(satResult: SATResultsEntity) = appDatabase.satResultDao().insertAllSAT(satResult)

    override suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults> {
        TODO("Not yet implemented")
    }
}