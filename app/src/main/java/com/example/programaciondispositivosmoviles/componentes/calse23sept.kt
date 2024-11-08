package com.example.programaciondispositivosmoviles.componentes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground =true)
@Composable
fun OperacionesAritmeticasScree  (){
    var number by remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.fillMaxSize()) {
        Text (text = "Dame un numero:")
        TextField(value = number.toString(), onValueChange = {
        })
    }


}
