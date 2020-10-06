package personajes

class Elfo:Personaje {

    protected var numFlechas:Int

    constructor(numFlechas: Int) : super() {
        this.numFlechas = numFlechas
    }

    fun lanzarFlecha(): Int {
        val flechasAntesCombate: Int = numFlechas
        var flechasLanzadas = 0
        numFlechas = numFlechas-1
        flechasLanzadas++
        return if (numFlechas === 0) {
            println(nombre + " SE HA QUEDADO SIN FLECHAS, LOS HÉROES TIENEN QUE ESCAPAR DE LA SALA.")
            return flechasAntesCombate
        } else {
            return flechasLanzadas
        }
    }

    fun recargarCarcaj(flechasSala: Int) {
        numFlechas += flechasSala
    }

}