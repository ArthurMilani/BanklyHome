package com.example.brincandocomcompose

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.brincandocomcompose.ui.theme.TextGrey
import com.example.brincandocomcompose.ui.theme.openSans

@Composable
fun ProfileImage(
    @DrawableRes drawable: Int,
    modifier: Modifier = Modifier
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(modifier = Modifier.width(6.dp))

        Column() {
            Text(text = "Milton Bertolini Antunes", fontFamily = openSans, fontWeight = FontWeight.Normal, color = TextGrey, fontSize = 13.sp)
            Text(text = "Conta: 23466", fontFamily = openSans, fontWeight = FontWeight.Normal, color = TextGrey, fontSize = 11.sp)

        }
    }
}

@Composable
fun ProfileRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        ProfileImage(drawable = R.drawable.avatar)
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = null
        )
    }
}