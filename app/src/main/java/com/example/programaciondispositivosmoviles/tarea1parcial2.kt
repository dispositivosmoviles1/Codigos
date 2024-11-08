package com.example.programaciondispositivosmoviles

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground=true)
@Composable
fun Botones(){
    var msj by remember{
        mutableStateOf("\"Por la fé y la razón\"")
    }

    var img by remember{
        mutableStateOf(R.drawable.aanahuac)
    }
    Column(modifier= Modifier
        .fillMaxSize()
        .background(color = Color(0xFFFF5722)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter= painterResource(id = img),
            contentDescription = "logo del iest XDDDD"
        )
        Text(text = msj)
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .weight(1F)
            ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red,
                        contentColor = Color.Green
                    ),
                    modifier = Modifier.fillMaxWidth(), onClick = {
                        if (msj == "\"Por la fé y la razón\"") {
                            msj = "\"Formando mejores personas\""
                        } else {
                            msj = "\"Por la fé y la razón\""
                        }
                    }
                ) {
                    Text(text = "Cambiar de texto")
                }
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)){
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Green
                ),
                modifier = Modifier.fillMaxWidth(), onClick = {
                    if (img == R.drawable.aanahuac) {
                        img = R.drawable.iestanahuac
                    } else {
                        img = R.drawable.aanahuac
                    }
                }
            ) {
                Text(text = "Cambiar de imagen")
            }
        }
    }
    }
}