package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember {
        mutableStateOf(0)
    }

    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0){
            Text(
                text = "You've had ${count} glasses."
            )
        }
        ElevatedButton(
            onClick = {count++},
            enabled = count < 10,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(text = "Add one")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewWaterCounter(){
    BasicStateCodeLabTheme {
        WaterCounter()
    }
}