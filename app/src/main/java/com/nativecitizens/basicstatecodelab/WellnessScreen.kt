package com.nativecitizens.basicstatecodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativecitizens.basicstatecodelab.ui.theme.BasicStateCodeLabTheme


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    StatefulCounter()
}


@Preview
@Composable
fun PreviewWellnessScreen(){
    BasicStateCodeLabTheme {
        WellnessScreen(Modifier.padding(16.dp))
    }
}