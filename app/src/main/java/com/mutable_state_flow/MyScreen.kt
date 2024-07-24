package com.mutable_state_flow

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyScreen(viewModel: MyViewModel ) {

    val state by viewModel.state.collectAsState()

    Column {
        Text(text = state)
        Button(onClick = {
                viewModel.updateState("New State")
        }) {
            Text(text = "Update State")
        }
    }

}

@Preview
@Composable
private fun PreviewMyScreen() {
    MyScreen(viewModel = MyViewModel())
}