package personajes

abstract class Personaje {

    var nombre: String? = null
    var vivo = false

    open fun Personaje(nombre: String?, vivo: Boolean) {
        this.nombre = nombre
        this.vivo = vivo
    }


}