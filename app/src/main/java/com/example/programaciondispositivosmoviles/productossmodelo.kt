package com.example.programaciondispositivosmoviles
// AQUI SE MODIFICATODO LO DE LA PANTALLAAA
import androidx.lifecycle.ViewModel

class productosviewmodel: ViewModel() {
    fun traerproductos(): MutableList<Producto> {
        var listaproductos = mutableListOf<Producto>()

        var productos = Producto(R.drawable.fundaunoazul,"Funda de silicón con MagSafe para el iPhone 16", "Color - Ultramarino",  "Gratis",  1000f)
        listaproductos.add(productos)

        listaproductos. add(Producto (R.drawable.fundadosamarillo, "Funda de silicón con MagSafe para el iPhone 16", "Color - Amarillo carambola",  "Gratis", 1010f))

        listaproductos. add(Producto (R.drawable.fundatresverde, "Funda de silicón con MagSafe para el iPhone 16", "Color - Verde lago",  "Express",1020f))

        listaproductos. add(Producto (R.drawable.fundacuatrofiusha, "Funda de silicón con MagSafe para el iPhone 16", "Color - Fucsia",  "Gratis", 1030f))

        /*listaproductos. add(Producto (R.drawable.fundacincogris, "Funda de silicón con MagSafe para el iPhone 16", "Color - Gris piedra",  "Gratis", 1040f))

        listaproductos. add(Producto (R.drawable.fundasietenegro, "Funda de silicón con MagSafe para el iPhone 16", "Color - Ciruela",  "Express", 1050f))

        listaproductos. add(Producto (R.drawable.fundasietenegro, "Funda de silicón con MagSafe para el iPhone 16", "Color - Negro",  "Express", 1060f))

        listaproductos. add(Producto (R.drawable.fundaochoazull, "Funda de silicón con MagSafe para el iPhone 16", "Color - Azul denim",  "Express", 1070f)) */


        return listaproductos
    }
    fun ola (){

    }
}