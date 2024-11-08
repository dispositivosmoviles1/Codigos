package com.example.programaciondispositivosmoviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun NueveCuadros () {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.2f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(64.dp)
                    .weight(.2f)
                    .background(Color.Red)
            ) {
                Text(text = "Caja 1", color = Color.White, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(.1f)
                    .background(Color.Blue)
            ) {
                Text(text = "Caja 2", color = Color.White, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f)
                    .height(90.dp)
                    .background(Color.Green)
            ) {
                Text(text = "Caja 3", color = Color.DarkGray, fontSize = 18.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(.2f)
                    .background(Color.Magenta)
            ) {
                Text(text = "Caja 4", color = Color.White, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f)
                    .background(Color.Black)
            ) {
                Text(text = "Caja 5", color = Color.White, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f)
                    .background(Color.Cyan)
            ) {
                Text(text = "Caja 6", color = Color.DarkGray, fontSize = 18.sp)
            }

            }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f)
                    .background(Color(0xFFE91E63))
            ) {
                Text(text = "Caja 7", color = Color.White, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(.2f)
                    .background(Color.Transparent), contentAlignment = Alignment.Center
            ) {
                Text(text = "Caja 8", color = Color.Black, fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(.2f)
                    .background(Color.Yellow), contentAlignment = Alignment.CenterEnd
            ) {
                Text(text = "Caja 9", color = Color.DarkGray, fontSize = 18.sp)
            }
        }

    }
}