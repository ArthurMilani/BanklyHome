package com.example.brincandocomcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MainScreen() {
   // var textFieldValue by remember { mutableStateOf("") }

    MainBody()
   //     textFieldValue = textFieldValue,
   //     onTextFieldValueChange = { textFieldValue = it}
   // )

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainBody(/*textFieldValue: String, onTextFieldValueChange: (String) -> Unit*/){

    var textFieldValue by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Meus Dados", fontSize = 20.sp, fontWeight = FontWeight.Bold )
        Spacer(modifier = Modifier.height(32.dp))
        TextField(
            value = textFieldValue,
            onValueChange= { textFieldValue = it},
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
            ),
            label = {
                Text(text = "Name")
            }
        )


        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            enabled= false,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF043bbd),
                disabledContainerColor = Color(0xFFc7c7c7))
        ) {
            Text(text = "Salvar", color = Color.White)
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}