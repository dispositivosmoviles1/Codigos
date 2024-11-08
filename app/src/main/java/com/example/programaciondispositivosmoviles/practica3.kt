package com.example.programaciondispositivosmoviles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.example.programaciondispositivosmoviles.ui.theme.myCustomFont2
import com.example.programaciondispositivosmoviles.ui.theme.myCustomFont3



@Preview(showBackground = true, locale= "en")
@Composable
fun PracticaNumeroTres(){
    Column(
    ) {

        Text(text = stringResource(R.string.hola))


        Text(
            text = "El MALVADO IMPERIO GALÁCTICO ha sucumbido\n" +
                    "y en su lugar se ha alzado una NUEVA REPÚBLICA.\n" +
                    "Sin embargo, hay agentes siniestros trabajando\n" +
                    "para debilitar esta paz tan frágil.\n" +
                    "\n" +
                    "Hay una conspiración en marcha para hallar\n" +
                    "al GRAN ALMIRANTE IMPERIAL THRAWN y\n" +
                    "traerlo del exilio. Aunque fue declarado muerto,\n" +
                    "se han esparcido rumores del regreso de Thrawn,\n" +
                    "lo cuál incitará a los REMANENTES IMPERIALES\n" +
                    "a iniciar otra guerra.\n" +
                    "\n" +
                    "La ex-caballero Jedi AHSOKA TANO capturó\n" +
                    "a uno de los aliados de Thrawn y se enteró de un\n" +
                    "mapa secreto que es vital para el plan del enemigo.\n" +
                    "Ahora Ahsoka busca el mapa mientras su prisionera,\n" +
                    "MORGAN ELSBETH, es transportada a la\n" +
                    "Nueva República para su juicio…",
            modifier = Modifier.background(Color.Black).graphicsLayer {
                this.rotationX = 10f
                this.rotationY = 0f
                this.rotationZ = 0f
            },
            fontFamily = myCustomFont3,
            color = Color.Yellow,
        )
    }
}
