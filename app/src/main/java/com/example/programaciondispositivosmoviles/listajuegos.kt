package com.example.programaciondispositivosmoviles
// ESTE ES EL QUE TIENE LA PANTALLA PREVIEW
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
//LazyRow para que se vea horizontal
//LazyColumn para que se lista en vertical
fun listajuegosscreen (){
    var listadejuegos = juegoviewmodel().traerjuegos()
    Box(modifier = Modifier.fillMaxSize()){

        Column (modifier = Modifier .background(color = Color.Black)){
            Text (text = "Continuar Viendo", color =Color.White)


        LazyRow {

            /*item {
                Text(text = "$5,000.00")
            }*/

            items(listadejuegos) { juegoactual ->

                CardView(juegoactual)
            }

           /* item {
                Text(text = "IEST 2024")
            }*/
        }
            Text (text = "Los mas vistos", color =Color.White)
            LazyRow {
                items(listadejuegos) { juegoactual ->
                    CardView(juegoactual)
                }

            }
            Text (text = "Estrenos", color =Color.White)
            LazyRow {
                items(listadejuegos) { juegoactual ->
                    CardView(juegoactual)
                }

            }

        }
    }
}