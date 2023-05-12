package com.ivy.dev.nycschoolsapp.data.local

import com.ivy.dev.nycschoolsapp.data.models.SchoolsWithSATResults
import com.ivy.dev.nycschoolsapp.data.remote.ApiHelper
import javax.inject.Inject

class DataManagerImpl @Inject constructor(
    private val apiHelper: ApiHelper,
    private val databaseHelper: DatabaseHelper) {

    suspend fun getSchoolsWithSATResults(): List<SchoolsWithSATResults> {
        // Primero, intenta obtener los datos de la base de datos local
        val schoolsWithSATResultsFromDb = databaseHelper.getSchoolsWithSATResults()

        // Si hay datos disponibles en la base de datos, devuelve esos datos
        if (schoolsWithSATResultsFromDb.isNotEmpty()) {
            return schoolsWithSATResultsFromDb
        }

        // Si no hay datos en la base de datos, llama a la API para obtener los datos remotos
        val schools = apiHelper.getSchools()
        val satResults = apiHelper.getSATResults()

        // Combina los datos de las dos fuentes
        val schoolsWithSATResults = mutableListOf<SchoolsWithSATResults>()
        for (school in schools) {
            val satResult = satResults.find {
                it.dbn == school.dbn }
            if (satResult != null) {
                schoolsWithSATResults.add(SchoolsWithSATResults(school, listOf( satResult)))
            }
        }

        // Guarda los datos combinados en la base de datos local
        // databaseHelper.insertSchoolsWithSATResults(schoolsWithSATResults)

        // Devuelve los datos combinados
        return schoolsWithSATResults
    }
}