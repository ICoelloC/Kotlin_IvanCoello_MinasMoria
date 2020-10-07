package zonajuego

import personajes.Elfo
import personajes.Hobbit
import personajes.Mago


class Moria {

    var mago:Mago
    var elfo:Elfo
    var hobbit:Hobbit
    var energiaMalignaSala: Int
    var numFlechasSala: Int
    var numEnemigos: Int

    protected enum class TipoSala {
        MAGICA, ACCION, HABILIDAD
    }

    protected var tipoSala: TipoSala? = null

    constructor(  mago: Mago, elfo: Elfo, hobbit: Hobbit ) {
        this.energiaMalignaSala = (Math.random()*20).toInt()
        this.numFlechasSala = 0
        this.numEnemigos = (Math.random()*6).toInt()
        this.mago = mago
        this.elfo = elfo
        this.hobbit = hobbit
    }


    fun simulacion() {
        var contSalas = 0
        for (i in 0..35) {
            println("**********************************SALA nº" + (i + 1) + "**********************************")
            val numAleatorioSala = (Math.random() * 3+1).toInt()
            when (numAleatorioSala) {
                1 -> {
                    tipoSala = TipoSala.MAGICA
                    energiaMalignaSala = (Math.random() * 20).toInt()
                }
                2 -> {
                    tipoSala = TipoSala.ACCION
                    numEnemigos = (Math.random() * 10).toInt()
                    numFlechasSala = 0
                }
                3 -> tipoSala = TipoSala.HABILIDAD
            }
            if (tipoSala === TipoSala.MAGICA) {
                if (this.mago.poderVara == energiaMalignaSala) {
                    val probabilidadVictoria = (Math.random() * 101).toInt()
                    if (probabilidadVictoria < 40) {
                        mago.vivo = false
                        println(mago.nombre + " HA MUERTO")
                        break
                    }
                } else {
                    if (this.mago.poderVara < energiaMalignaSala) {
                        val probabilidadVictoria = (Math.random() * 101).toInt()
                        if (probabilidadVictoria > 30) {
                            this.mago.vivo = false
                            println(this.mago.nombre + " HA MUERTO")
                            break
                        }
                    }
                }
                if (this.mago.vivo) {
                    println(mago.nombre + " HA SOBREVIVIDO, LOS HÉROES PASAN DE SALA")
                    print("CON CUANTA ENERGÍA QUIERES RECARGAR LA VARA: ")
                    val poderVara: Int = readLine()!!.toInt()
                    this.mago.recargarVara(poderVara)
                }
            } else {
                if (tipoSala === TipoSala.ACCION) {
                    var quedanEnemigos = true
                    while (quedanEnemigos) {
                        numFlechasSala += this.elfo.lanzarFlecha()
                        numEnemigos -= 1
                        if (this.elfo.numFlechas == 0) {
                            println(this.elfo.nombre + " SE HA QUEDADO SIN FLECHAS, TIENE QUE ESCAPAR")
                            val probabilidadEscaparSala = (Math.random() * 101).toInt()
                            if (probabilidadEscaparSala < 20) {
                                this.elfo.vivo = false
                                println(this.elfo.nombre + " HA MUERTO")
                                break
                            }
                            break
                        }
                        if (numEnemigos == 0) {
                            quedanEnemigos = false
                            println(this.elfo.nombre + " HA MATADO A TODOS LOS ENEMIGOS DE LA SALA")
                            this.elfo.recargarCarcaj(numFlechasSala)
                            break
                        }
                    }
                    if (this.elfo.vivo) {
                        println(this.elfo.nombre + " HA SOBREVIVIDO, LOS HÉROES PASAN DE SALA")
                    }else{
                        break
                    }
                } else {
                    val probabilidadPonerseAnillo = (Math.random() * 101).toInt()
                    if (probabilidadPonerseAnillo >= 50) {
                        this.hobbit.ponerseAnillo()
                    } else {
                        this.hobbit.quitarseAnillo()
                    }
                    if (this.hobbit.vivo) {
                        val probSuperarPeligo = (Math.random() * 101).toInt()
                        if (probSuperarPeligo <= 10) { //si no supera el peligro
                            val probEscaparSala = (Math.random() * 101).toInt()
                            //solo pasa a la siguiente sala, si la prob es mayor de 20 (80%)
                            if (probEscaparSala < 20) {
                                this.hobbit.vivo = false
                                println(this.hobbit.nombre + " HA MUERTO")
                                break
                            }
                        }
                    } else {
                        val probSuperarPeligo = (Math.random() * 101).toInt()
                        if (probSuperarPeligo >= 20) {
                            val probEscaparSala = (Math.random() * 101).toInt()
                            //solo pasa a la siguiente sala, si la prob es mayor de 20 (80%)
                            if (probEscaparSala < 20) {
                                this.hobbit.vivo = false
                                println(this.hobbit.nombre + " HA MUERTO")
                                break
                            }
                        }
                    }
                    if (hobbit.vivo) {
                        println(this.hobbit.nombre + " HA SOBREVIVIDO, LOS HÉROES PASAN DE SALA")
                    }
                }
            }
            contSalas++
        }
        println("***************************************************************************")
        println()
        println("LOS HÉROES HAN PASADO $contSalas SALAS")
        println()
        println()
        println()
        println("¡¡¡FIN DE LA SIMULACIÓN!!!")
    }

}