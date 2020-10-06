package zonajuego

import personajes.Elfo
import personajes.Hobbit
import personajes.Mago


abstract class Sala {

    protected var energiaMalignaSala :Int
    protected var numFlechasSala:Int
    protected var numEnemigos :Int

    protected enum class TipoSala {
        MAGICA, ACCION, HABILIDAD
    }

    protected var tipoSala: TipoSala? = null

    constructor( energiaMalignaSala: Int, numFlechasSala: Int, numEnemigos: Int) {
        this.energiaMalignaSala = energiaMalignaSala
        this.numFlechasSala = numFlechasSala
        this.numEnemigos = numEnemigos
        this.tipoSala = tipoSala
    }
}