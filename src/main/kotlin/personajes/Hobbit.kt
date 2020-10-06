package personajes

class Hobbit: Personaje {

    public  var anilloPuesto:Boolean

    constructor(nombre:String, anilloPuesto: Boolean, vivo:Boolean) : super() {
        this.nombre = nombre
        this.anilloPuesto = anilloPuesto
        this.vivo = vivo
    }

    fun ponerseAnillo() {
        if (anilloPuesto) {
            println(this.nombre+ " YA TENIA EL ANILLO PUESTO.")
        } else {
            anilloPuesto = true
            println(this.nombre + " SE PONE EL ANILLO,")
        }
    }

    fun quitarseAnillo() {
        if (anilloPuesto) {
            anilloPuesto = false
            println(this.nombre + " SE QUITA EL ANILLO")
        } else {
            println(this.nombre + " YA TENIA EL ANILLO QUITADO.")
        }
    }

}