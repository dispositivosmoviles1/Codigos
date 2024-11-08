package com.example.programaciondispositivosmoviles

import androidx.lifecycle.ViewModel

class peliviewmodel: ViewModel() {
    fun traerpelis (): MutableList<Peli> {
        var listadepelis = mutableListOf<Peli>()

        var peli = Peli(R.drawable.dvalmcvuno)
        listadepelis.add(peli)

        listadepelis. add(Peli (R.drawable.dhcvdos))
        listadepelis. add(Peli (R.drawable.qralncvtres))
        listadepelis. add(Peli (R.drawable.cpuheddcvcuatro))
        listadepelis. add(Peli (R.drawable.ycvcinco))
        listadepelis. add(Peli (R.drawable.lncvseis))
        return listadepelis
    }

    fun traerpelisdos (): MutableList<Peli> {
        var listadepelis = mutableListOf<Peli>()

        var peli = Peli(R.drawable.blflmvuno)
        listadepelis.add(peli)

        listadepelis. add(Peli (R.drawable.stlmvdos))
        listadepelis. add(Peli (R.drawable.bdlmvtres))
        listadepelis. add(Peli (R.drawable.ilmvcuatro))
        listadepelis. add(Peli (R.drawable.thalmvcinco))
        listadepelis. add(Peli (R.drawable.eicdvlmvseis))
        return listadepelis
    }

    fun traerpelistres (): MutableList<Peli> {
        var listadepelis = mutableListOf<Peli>()

        var peli = Peli(R.drawable.aeuno)
        listadepelis.add(peli)

        listadepelis. add(Peli (R.drawable.bedos))
        listadepelis. add(Peli (R.drawable.onetres))
        listadepelis. add(Peli (R.drawable.urecuatro))
        listadepelis. add(Peli (R.drawable.pecinco))
        listadepelis. add(Peli (R.drawable.aeeseis))
        return listadepelis
    }


}