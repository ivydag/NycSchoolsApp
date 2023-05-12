package com.ivy.dev.nycschoolsapp.data.models

import androidx.room.Embedded
import androidx.room.Relation

//Pending information
data class SchoolsWithSATResults(
    @Embedded val school: SchoolsItem,
    @Relation(
        parentColumn = "dbn",
        entityColumn = "dbn"
    )
    val satResults: List<SATResultsItem>
)