package zonajuego

import personajes.Elfo
import personajes.Hobbit
import personajes.Mago


abstract class Sala {

    protected var energíaMalignaSala = 0
    protected var numFlechasSala = 0
    protected var numEnemigos = 0

    enum class TipoSala {
        MAGICA, ACCION, HABILIDAD
    }

    protected var tipoSala: TipoSala
    protected var mago = Mago("Gándalf", 30, true)
    protected var elfo =  Elfo("Légolas", 30, true)
    protected var hobbit = Hobbit("Frodo", true, true)

    constructor( energíaMalignaSala: Int, numFlechasSala: Int, numEnemigos: Int, tipoSala: TipoSala, mago: Mago, elfo: Elfo, hobbit: Hobbit ) {
        this.energíaMalignaSala = energíaMalignaSala
        this.numFlechasSala = numFlechasSala
        this.numEnemigos = numEnemigos
        this.tipoSala = tipoSala
        this.mago = mago
        this.elfo =  elfo
        this.hobbit = hobbit
    }

}