package com.example.programaciondispositivosmoviles
// ESTE ES EL QUE TIENE LA PANTALLA PREVIEW
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview (showBackground = true)
@Composable
//LazyRow para que se vea horizontal
//LazyColumn para que se lista en vertical
fun listaproductosscreen (){
    var listadeproductos = productosviewmodel()
    Box(modifier = Modifier.fillMaxSize()){

            LazyColumn {


                items(listadeproductos.traerproductos()) { productoactual ->

                    CardView(productoactual)
                }


            }



        }
    }

