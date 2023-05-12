package com.ivy.dev.nycschoolsapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.ivy.dev.nycschoolsapp.data.models.SchoolsItem
import com.ivy.dev.nycschoolsapp.data.remote.ApiHelper
import com.ivy.dev.nycschoolsapp.data.remote.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class SchoolsViewmodel @Inject constructor(
    private val apiHelper: ApiHelper
):ViewModel() {

    suspend fun getSchools(): Resource<List<SchoolsItem>> {
        return try {
            val response = apiHelper.getSchools()
            Resource.Success(response)
        }catch (e:Exception){
            Resource.Error(e.message ?: "An error ocurred")
        }
    }
}