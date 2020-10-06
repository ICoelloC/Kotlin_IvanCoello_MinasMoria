package personajes

class Mago:Personaje {

    protected var poderVara: Int

    constructor(nomre:String, poderVara: Int, vivo:Boolean) : super() {
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