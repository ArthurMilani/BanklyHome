package com.example.brincandocomcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brincandocomcompose.ui.theme.TextGrey
import com.example.brincandocomcompose.ui.theme.openSans

@Composable
fun MoneyRow() {

    var isClicked by remember{ mutableStateOf(false) }
    val myPainter = if(isClicked) painterResource(id = R.drawable.ic_eye) else painterResource(id = R.drawable.ic_eye)
    val money: String = "15.000,00"


    Column() {
        Row(verticalAlignment = Alignment.CenterVertically,) {
            Text(
                text = "Saldo Disponível",
                fontFamily = openSans,
                fontWeight = FontWeight.Normal,
                color = TextGrey,
                fontSize = 11.sp
            )
            Spacer(modifier = Modifier.width(15.dp))
            Icon(
                painter = myPainter,
                contentDescription = null,
                modifier = Modifier.clickable { isClicked = !isClicked })

        }
        Spacer(modifier = Modifier.height(0.dp))
        if(!isClicked){
            Text(text = "R$ $money", fontFamily = openSans, fontWeight = FontWeight.Bold, fontSize = 28.sp, color = TextGrey)
        }else{
            Text(text = "R$ ********", fontFamily = openSans, fontWeight = FontWeight.Bold, fontSize = 28.sp, color = TextGrey)
        }

    }
}