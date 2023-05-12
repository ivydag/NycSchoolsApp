package com.ivy.dev.nycschoolsapp.data.local.schools

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SchoolsEntity(
    @PrimaryKey val dbn: String,
    val school_name: String,
    val neighborhood: String,
    val location: String,
    val website: String,
    val phone_number: String,
    val school_email: String,
    val overview_paragraph: String
)