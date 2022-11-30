package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nativecitizens.basicstatecodelab.data.WellnessViewModel
import com.nativecitizens.basicstatecodelab.model.WellnessTask
import com.nativecitizens.basicstatecodelab.ui.components.StatefulCounter
import com.nativecitizens.basicstatecodelab.ui.components.WellnessTasksList
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = wellnessViewModel.tasks

        WellnessTasksList(
            modifier = Modifier.padding(horizontal = 8.dp),
            list = list,
            onCheckedChange = {task, checkState ->
                wellnessViewModel.updateTaskChecked(task, checkState)
            },
            onClose = { task: WellnessTask -> wellnessViewModel.remove(task)}
        )
    }
}


@Preview
@Composable
fun PreviewWellnessScreen(){
    BasicStateCodeLabTheme {
        WellnessScreen(Modifier.padding(16.dp))
    }
}