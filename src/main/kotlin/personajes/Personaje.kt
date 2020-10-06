package personajes

abstract class Personaje {

    protected var nombre: String? = null
    protected var vivo = false

    open fun Personaje(nombre: String?, vivo: Boolean) {
        this.nombre = nombre
        this.vivo = vivo
    }


}