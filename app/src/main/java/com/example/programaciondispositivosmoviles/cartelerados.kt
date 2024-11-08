package com.example.programaciondispositivosmoviles
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.CollationKey
//lo que se repite en la lista
//@Preview(showBackground  = true)
@Composable
fun  CardView (peli: Peli){

    /*val juego = Juego(R.drawable.mariokard,
        "Mario Kard",
        "Nintendo Swithc",
        1200f)*/


    Card (onClick ={}) {
        Row(modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = peli.caratura),
                contentDescription = "portada de la peli",
                modifier = Modifier
                    .height(150.dp)
                    .width(120.dp),
                contentScale = ContentScale.Fit
            )


            }
        }

    }
