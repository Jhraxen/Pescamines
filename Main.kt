fun main(){
    var opcio = 0
    var fila = 0
    var columna = 0
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

          opcio = readLine()!!.toInt()


        while (opcio < 1 || opcio > 4){
            println ("Introdueix una opció correcta:")
            opcio = readLine()!!.toInt()
        }
       
            when (opcio) {
                1 -> {
                    println("Introdueix la fila:")
                         fila = readLine()!!.toInt()-1
                    while (fila < 0 || fila >= n){
                        println("La fila ha de ser entre 1 i $n")
                        println("Introdueix la fila:")
                         fila = readLine()!!.toInt()-1
                    }
                    println("Introdueix la columna:")
                        columna = readLine()!!.toInt()-1
                    while (columna < 0 || columna >= n){
                        println("La columna ha de ser entre 1 i $n")
                        println("Introdueix la columna:")
                        columna = readLine()!!.toInt()-1
                    }
                    tauler.marcaMina(fila, columna)
                    tauler.mostraTauler()
                }
                2 -> {
                    println("Introdueix la fila:")
                    fila = readLine()!!.toInt()-1
                    while (fila < 0 || fila >= n){
                        println("La fila ha de ser entre 1 i $n")
                        println("Introdueix la fila:")
                        fila = readLine()!!.toInt()-1
                    }
                    println("Introdueix la columna:")
                    columna = readLine()!!.toInt()-1
                    while (columna < 0 || columna >= n){
                        println("La columna ha de ser entre 1 i $n")
                        println("Introdueix la columna:")
                        columna = readLine()!!.toInt()-1
                    }
                    tauler.marcaMina(fila, columna)
                    tauler.mostraTauler()
                }
                3 -> {
                    println("Introdueix la fila:")
                         fila = readLine()!!.toInt()-1
                    while (fila < 0 || fila >= n){
                        println("La fila ha de ser entre 1 i $n")
                        println("Introdueix la fila:")
                         fila = readLine()!!.toInt()-1
                    }
                    println("Introdueix la columna:")
                        columna = readLine()!!.toInt()-1
                    while(columna < 0 || columna >= n){
                        println("La columna ha de ser entre 1 i $n")
                        println("Introdueix la columna:")
                         columna = readLine()!!.toInt()-1
                    }
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

