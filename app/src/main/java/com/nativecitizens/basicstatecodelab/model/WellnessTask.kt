package com.nativecitizens.basicstatecodelab.model


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class WellnessTask(
    val id: Int,
    val label: String,
    initializedCheck: Boolean = false
){
    var checked by mutableStateOf(initializedCheck)
}