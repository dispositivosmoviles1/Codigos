package com.example.programaciondispositivosmoviles
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground=true)
@Composable
fun Calculadora(){
    var number1 by remember{
        mutableFloatStateOf(0.0f)
    }
    var number2 by remember{
        mutableFloatStateOf(0.0f)
    }
    var number3 by remember{
        mutableFloatStateOf(0.0f)
    }
    var ans1 by remember{
        mutableFloatStateOf(0.0f)
    }
    var ans2 by remember{
        mutableFloatStateOf(0.0f)
    }
    var ans3 by remember{
        mutableFloatStateOf(0.0f)
    }
    var ans4 by remember{
        mutableFloatStateOf(0.0f)
    }
    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
    ){
       Text(text="Número 1: ", color=Color.White)
        TextField(value = number1.toString(),
            onValueChange = {
                if(it.isNotEmpty()){
                    number1= it.toFloat()
                }
            }
        )

        Text(text="Número 2: ", color=Color.White)
        TextField(value = number2.toString(),
            onValueChange = {
                if(it.isNotEmpty()){
                    number2= it.toFloat()
                }
            }
        )
        Text(text="Número 3: ", color=Color.White)
        TextField(value = number3.toString(),
            onValueChange = {
                if(it.isNotEmpty()){
                    number3= it.toFloat()
                }
            }
        )

        Button(onClick = {
            ans1=minOf(number1,number2,number3)
        }) {
            Text(text="Min")}

        Icon(
            modifier = Modifier.clickable {  },
            painter= painterResource(
                id=R.drawable.carafeliz
            ), tint = Color.White,
            contentDescription = "ola"

        )
        Text(text = "El menor es: $ans1")

    }
}