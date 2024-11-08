package com.example.programaciondispositivosmoviles
// AQUI SE MODIFICATODO LO DE LA PANTALLAAA
import androidx.lifecycle.ViewModel

class juegoviewmodel: ViewModel() {
    fun traerjuegos (): MutableList<Juego> {
        var listadejuegos = mutableListOf<Juego>()

        var juego = Juego(R.drawable.mariokard, "The Devil Wears Prada", "Nintendo Swithc", 1200f)
        listadejuegos.add(juego)

        listadejuegos. add(Juego (R.drawable.aanahuac, "Dr. House", "Nintendo Swithc",  1200f))

        listadejuegos. add(Juego (R.drawable.mariokard, "Made of Honor", "Nintendo Swithc",  1200f))

        listadejuegos. add(Juego (R.drawable.aanahuac, "How to Lose a Guy in 10 Days", "Nintendo Swithc",  1200f))

        listadejuegos. add(Juego (R.drawable.mariokard, "Yellowstone", "Nintendo Swithc",  1200f))

        listadejuegos. add(Juego (R.drawable.aanahuac, "Crepúsculo: Luna Nueva", "Nintendo Swithc",  1200f))


        return listadejuegos
    }
    fun comprar (){

    }

}