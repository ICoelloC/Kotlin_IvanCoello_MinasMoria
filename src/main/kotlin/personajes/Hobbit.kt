package personajes

class Hobbit: Personaje {

    protected  var anilloPuesto:Boolean

    constructor(anilloPuesto: Boolean) : super() {
        this.anilloPuesto = anilloPuesto
    }

    fun ponerseAnillo() {
        if (anilloPuesto) {
            println(nombre!!.toUpperCase() + " YA TENIA EL ANILLO PUESTO.")
        } else {
            anilloPuesto = true
            println(nombre!!.toUpperCase() + " SE PONE EL ANILLO,")
        }
    }

    fun quitarseAnillo() {
        if (anilloPuesto) {
            anilloPuesto = false
            println(nombre + " SE QUITA EL ANILLO")
        } else {
            println(nombre + " YA TENIA EL ANILLO QUITADO.")
        }
    }

}