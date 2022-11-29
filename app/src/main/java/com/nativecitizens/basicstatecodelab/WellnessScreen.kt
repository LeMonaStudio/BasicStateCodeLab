package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.model.WellnessTask
import com.nativecitizens.basicstatecodelab.model.WellnessTasksList
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTaskList().toMutableStateList() }

        WellnessTasksList(
            modifier = Modifier.padding(horizontal = 8.dp),
            list = list
        ) { task: WellnessTask ->
            list.remove(task)
        }
    }
}

fun getWellnessTaskList(): List<WellnessTask> =
    List(30) { i -> WellnessTask(i, "Task # $i") }


@Preview
@Composable
fun PreviewWellnessScreen(){
    BasicStateCodeLabTheme {
        WellnessScreen(Modifier.padding(16.dp))
    }
}