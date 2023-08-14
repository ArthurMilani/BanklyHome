package com.example.brincandocomcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun Banner() {
    Image(painter = painterResource(id = R.drawable.img_banner_jpg), contentDescription = null, modifier = Modifier.aspectRatio(16f / 9f),)
}