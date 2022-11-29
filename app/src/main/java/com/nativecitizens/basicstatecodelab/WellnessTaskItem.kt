package com.nativecitizens.basicstatecodelab

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WellnessTaskItem(
    taskName: String,
    modifier: Modifier = Modifier,
    onClose: () -> Unit
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(8.dp)
    ) {
        Text(text = taskName)
        IconButton(
            onClick = {
                onClose()
            }
        ) {
            Icon(
                Icons.Rounded.Close,
                contentDescription = null)
        }
    }
}


@Preview
@Composable
fun PreviewWellnessTaskItem(){
    BasicStateCodeLabTheme {
        WellnessTaskItem("Task #1", Modifier.fillMaxWidth(), {})
    }
}