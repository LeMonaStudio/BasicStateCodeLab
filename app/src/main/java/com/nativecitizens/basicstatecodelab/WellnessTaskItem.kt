package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.model.WellnessTask
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun StatelessWellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = taskName,
            Modifier.weight(1f)
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        IconButton(
            onClick = onClose
        ) {
            Icon(
                Icons.Rounded.Close,
                contentDescription = null)
        }
    }
}


@Composable
fun StatefulWellnessTaskItem(taskName: String, onClose: () -> Unit, modifier:Modifier = Modifier){
    var checkedState by rememberSaveable() {
        mutableStateOf(false)
    }

    StatelessWellnessTaskItem(
        taskName = taskName,
        checked = checkedState,
        onCheckedChange = {
            checkedState = !checkedState
        },
        onClose = onClose,
        modifier = modifier
    )

}


@Preview
@Composable
fun PreviewWellnessTaskItem(){
    BasicStateCodeLabTheme {
        StatefulWellnessTaskItem(
            "Task #1",
            modifier = Modifier.fillMaxWidth(), onClose = {})
    }
}