package personajes

class Elfo:Personaje {

    var numFlechas:Int

    constructor(nombre:String, numFlechas: Int, vivo:Boolean) : super() {
        this.nombre = nombre
        this.numFlechas = numFlechas
        this.vivo = vivo
    }

    fun lanzarFlecha(): Int {
        val flechasAntesCombate: Int = numFlechas
        var flechasLanzadas = 0
        numFlechas = numFlechas-1
        flechasLanzadas++
        return flechasLanzadas
    }

    fun recargarCarcaj(flechasSala: Int) {
        numFlechas += flechasSala
    }

}