package personajes

class Mago:Personaje {

    protected var poderVara: Int

    constructor(poderVara: Int) : super() {
        this.poderVara = poderVara
    }

    fun recargarVara(energíaIntroducida: Int) {
        poderVara = poderVara + energíaIntroducida
    }

    fun verPoderVara(): Int {
        return poderVara
    }

}