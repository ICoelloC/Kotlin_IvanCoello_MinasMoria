package personajes

class Mago:Personaje {

    var poderVara: Int

    constructor(nombre:String, poderVara: Int, vivo:Boolean) : super() {
        this.nombre = nombre
        this.poderVara = poderVara
        this.vivo = vivo
    }

    fun recargarVara(energiaIntroducida: Int) {
        this.poderVara -= energiaIntroducida
    }

    fun verPoderVara(): Int {
        return poderVara
    }

}