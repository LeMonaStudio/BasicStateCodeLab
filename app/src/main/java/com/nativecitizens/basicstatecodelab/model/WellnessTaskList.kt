package com.nativecitizens.basicstatecodelab.model

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nativecitizens.basicstatecodelab.StatefulWellnessTaskItem

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onClose: (task: WellnessTask)-> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list){ task ->
            StatefulWellnessTaskItem(taskName = task.label, onClose = {onClose(task)})
        }
    }
}