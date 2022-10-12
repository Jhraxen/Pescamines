fun main(){
    println("Benvinguts al Pescamines!!!")
    println("Introdueix la mida del tauler:")
    val n = readLine()!!.toInt()
    println ("Introdueix la quantitat de mines:")
    val mines = readLine()!!.toInt()
    val tauler = Tauler(n, mines)
    tauler.posaMines(mines)
    tauler.comptaMines()
    tauler.mostraTauler()
    while (true){
       println ("Introdueix una opció:")
         println ("1. Marcar casella")
         println ("2. Desmarcar casella")
         println ("3. Descobrir casella")
         println ("4. Sortir")
     
         val opcio = readLine()!!.toInt() 
            when (opcio){
                1 -> {
                    println("Introdueix la fila:")
                    val fila = readLine()!!.toInt()-1
                    println("Introdueix la columna:")
                    val columna = readLine()!!.toInt()-1
                    tauler.marcaMina(fila, columna)
                    tauler.mostraTauler()
                }
                2 -> {
                    println("Introdueix la fila:")
                    val fila = readLine()!!.toInt()-1
                    println("Introdueix la columna:")
                    val columna = readLine()!!.toInt()-1
                    tauler.marcaMina(fila, columna)
                    tauler.mostraTauler()
                }
                3 -> {
                    println("Introdueix la fila:")
                    val fila = readLine()!!.toInt()-1
                    println("Introdueix la columna:")
                    val columna = readLine()!!.toInt()-1
                    tauler.descobreixCasella(fila, columna)
                    if (tauler.hiHaMina(fila,columna)){
                        tauler.descobreixTauler()
                        tauler.mostraTauler()
                        println("Has perdut")
                        break
                    }
                    tauler.mostraTauler()
                }
                4 -> {
                    tauler.descobreixTauler()
                    tauler.mostraTauler()
                    println("Gràcies per jugar!")
                    break
                }
            }
    }
}

