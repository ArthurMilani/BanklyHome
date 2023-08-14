package com.example.brincandocomcompose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brincandocomcompose.ui.theme.ButtonGreen
import com.example.brincandocomcompose.ui.theme.TextGrey
import com.example.brincandocomcompose.ui.theme.openSans

@Composable
fun BottomButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonGreen,
            contentColor = TextGrey
        )
    ) {
        Text(text = "Ver Extrato".uppercase(), fontFamily = openSans, fontWeight = FontWeight.Bold, fontSize = 13.sp)
    }

}