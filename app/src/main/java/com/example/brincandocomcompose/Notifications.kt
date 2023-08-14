package com.example.brincandocomcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brincandocomcompose.ui.theme.TextGrey
import com.example.brincandocomcompose.ui.theme.openSans

@Composable
fun Notifications() {
    val notifications = listOf<Notification>(
        Notification("Mercado Livre", "Compras", "08/10/2023", "14:00:45", "50.00"),
        Notification("Mercado Pago", "Compras", "07/10/2023", "14:00:45", "100.00"),
        Notification("Amazon", "Cartão", "09/10/2023", "14:00:45", "150.00"),
        Notification("Pix", "Banco", "10/10/2023", "14:00:45", "25.00")
    )
    val myPainter = painterResource(id = R.drawable.ic_green)

    Column() {
        notifications.forEach(){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = myPainter, contentDescription = null, tint = Color.Unspecified)
                    Spacer(modifier = Modifier.width(12.dp))
                    Column() {
                        Text(text = it.message, fontFamily = openSans, fontWeight = FontWeight.Normal, color = TextGrey, fontSize = 8.sp )
                        Text(text = it.title, fontFamily = openSans, fontWeight = FontWeight.Bold, color = TextGrey, fontSize = 13.sp )
                        Row() {
                            Text(text =it.date, fontFamily = openSans, fontWeight = FontWeight.Normal, color = TextGrey, fontSize = 8.sp )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text =it.hour, fontFamily = openSans, fontWeight = FontWeight.Normal, color = TextGrey, fontSize = 8.sp )
                        }
                    }
                }
                Text(text = "R$ ${it.price}", fontFamily = openSans, fontWeight = FontWeight.Bold, color = TextGrey, fontSize = 13.sp )
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}