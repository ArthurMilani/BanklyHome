package com.example.brincandocomcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brincandocomcompose.ui.theme.ButtonGreen
import com.example.brincandocomcompose.ui.theme.TextGrey
import com.example.brincandocomcompose.ui.theme.openSans

@Composable
fun ButtonRow(isClicked: Boolean) {

    val listaDeBotoes = AgrupadorDeBotoes.agrupadorDeBotoes(ButtonList.buttonList)


    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        listaDeBotoes[0].forEach {
            ButtonPattern(it.iconId, it.text)
        }
    }


    if(isClicked) {
        for(row in 1 until listaDeBotoes.size) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                for(button in listaDeBotoes[row]) {
                    ButtonPattern(button.iconId, button.text)
                }
            }
        }
    }
}


@Composable
fun ButtonPattern(iconId: Int = R.drawable.ic_pix, text: String = "Pattern", size: Dp = 28.dp) {

    Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(79.dp)) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(48.dp)
                .height(48.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ButtonGreen,
                contentColor = TextGrey
            )
        ) {
            Icon(
                painter = painterResource(iconId),
                contentDescription = null,
                modifier = Modifier.size(size)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = text, fontFamily = openSans, color = TextGrey, fontSize = 11.sp)

    }
}

@Composable
fun Atalhos() {
    var isClicked by remember { mutableStateOf(false) }
    val showMore = if(isClicked) "Ver Menos" else "Ver Mais"
    val myPainter = if(isClicked) painterResource(id = R.drawable.ic_arrow_up) else painterResource(id = R.drawable.ic_arrow_down)

    Column() {
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Atalhos", fontFamily = openSans, fontWeight = FontWeight.Bold, fontSize = 11.sp,  color = TextGrey)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = showMore, fontFamily = openSans, fontWeight = FontWeight.Normal, fontSize = 11.sp, color = TextGrey)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = myPainter,
                    contentDescription = null,
                    modifier = Modifier.clickable { isClicked = !isClicked }
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        ButtonRow(isClicked = isClicked)
    }
}