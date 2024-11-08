package com.example.programaciondispositivosmoviles.componentes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.programaciondispositivosmoviles.R

@Preview(showBackground = true)
@Composable
fun MiPrimerImagen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            contentScale = ContentScale.Fit,
            modifier = Modifier.height(400.dp)
                .width(260.dp),
            painter =
            painterResource(
                id = R.drawable.logoiest
            ),
            contentDescription = "Logo IEST")


    }
}