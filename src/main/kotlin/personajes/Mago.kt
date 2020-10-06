package personajes

class Mago:Personaje {

    var poderVara: Int

    constructor(nombre:String, poderVara: Int, vivo:Boolean) : super() {
        this.nombre = nombre
        this.poderVara = poderVara
        this.vivo = vivo
    }

    fun recargarVara(energíaIntroducida: Int) {
        poderVara = poderVara + energíaIntroducida
    }

    fun verPoderVara(): Int {
        return poderVara
    }

}