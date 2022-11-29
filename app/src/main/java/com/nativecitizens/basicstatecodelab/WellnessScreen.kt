package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.model.WellnessTasksList
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList(modifier = Modifier.padding(horizontal = 8.dp))
    }
}

@Preview
@Composable
fun PreviewWellnessScreen(){
    BasicStateCodeLabTheme {
        WellnessScreen(Modifier.padding(16.dp))
    }
}