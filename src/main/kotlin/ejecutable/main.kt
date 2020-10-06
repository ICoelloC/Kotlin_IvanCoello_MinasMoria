package ejecutable

import personajes.Elfo
import personajes.Hobbit
import personajes.Mago
import zonajuego.Moria

fun main(){

    val mago = Mago("Gándalf", 30, true)
    val elfo = Elfo("Légolas", 15, true)
    val hobbit = Hobbit("Frodo", true, true)

    val minasMoria = Moria(0,0,0,mago,elfo,hobbit)

    minasMoria.simulacion()
}