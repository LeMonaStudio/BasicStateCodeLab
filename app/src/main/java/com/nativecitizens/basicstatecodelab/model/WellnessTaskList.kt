package com.nativecitizens.basicstatecodelab.model

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.nativecitizens.basicstatecodelab.StatefulWellnessTaskItem

fun getWellnessTaskList(): List<WellnessTask> =
    List(30) { i -> WellnessTask(i, "Task # $i") }


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTaskList() }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list){ task ->
            StatefulWellnessTaskItem(taskName = task.label)
        }
    }
}