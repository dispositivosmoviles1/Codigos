package com.example.programaciondispositivosmoviles

import androidx.annotation.DrawableRes

data class Juego (
    @DrawableRes val caratura: Int,
    val nombreDelJuego: String,
    val consola: String,
    val precio: Float,
)