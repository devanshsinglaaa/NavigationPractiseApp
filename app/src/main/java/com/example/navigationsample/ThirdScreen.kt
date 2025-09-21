package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationsample.ui.theme.NavigationSampleTheme


@Composable
fun ThirdScreen(gotoFirstScreen:()->Unit) {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "This is Third Screen!",
            fontSize = 32.sp,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Welcome",
            fontSize = 32.sp,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { gotoFirstScreen() }) {
            Text(
                text = "Click Me to goto First Screen",
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview() {
    NavigationSampleTheme {
        ThirdScreen({})
    }
}