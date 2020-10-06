package zonajuego

import personajes.Elfo
import personajes.Hobbit
import personajes.Mago

class Moria: Sala {

    private val minasMoria: Array<Sala>

    constructor( energíaMalignaSala: Int, numFlechasSala: Int, numEnemigos: Int, tipoSala: TipoSala, mago: Mago, elfo: Elfo, hobbit: Hobbit, minasMoria: Array<Sala> ) : super(energíaMalignaSala, numFlechasSala, numEnemigos, tipoSala, mago, elfo, hobbit) {
        this.minasMoria = minasMoria
    }



}