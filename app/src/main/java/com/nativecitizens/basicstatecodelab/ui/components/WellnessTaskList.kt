package com.nativecitizens.basicstatecodelab.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nativecitizens.basicstatecodelab.model.WellnessTask

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCheckedChange: (task: WellnessTask, checkState: Boolean)-> Unit,
    onClose: (task: WellnessTask)-> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list){ task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = {onCheckedChange(task, !task.checked)},
                onClose = {onClose(task)}
            )
        }
    }
}