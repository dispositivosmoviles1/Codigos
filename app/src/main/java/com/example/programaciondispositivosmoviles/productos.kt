package com.example.programaciondispositivosmoviles

import androidx.annotation.DrawableRes

data class Producto (
    @DrawableRes val imagen: Int,
    val nombreproducto: String,
    val color: String,
    val tipoenvio: String,
    val precios: Float,
)