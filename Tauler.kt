class Tauler(var n: Int = 0, var nm: Int = 0){
    var tauler = Array(n) { Array(n) { Casella() } }
    
    //constructor(n: Int, nm: Int)
    fun Tauler(n: Int, nm: Int) {
        this.n = n
        this.nm = nm
        tauler = Array(n) { Array(n) { Casella() } }
        posaMines(nm)
    }

    //métoda posaMines
    fun posaMines(nm: Int) {
        var i = 0
        while (i < nm) {
            var x = (0 until n).random()
            var y = (0 until n).random()
            if (!tauler[x][y].getEsMina()) {
                tauler[x][y].setEsMina(true)
                i++
            }
        }
    }
    //comptaMines
    fun comptaMines(){
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (tauler[i][j].getEsMina()) {
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        tauler[i - 1][j - 1].setMines(tauler[i - 1][j - 1].getMines() + 1)
                    }
                    if (i - 1 >= 0) {
                        tauler[i - 1][j].setMines(tauler[i - 1][j].getMines() + 1)
                    }
                    if (i - 1 >= 0 && j + 1 < n) {
                        tauler[i - 1][j + 1].setMines(tauler[i - 1][j + 1].getMines() + 1)
                    }
                    if (j - 1 >= 0) {
                        tauler[i][j - 1].setMines(tauler[i][j - 1].getMines() + 1)
                    }
                    if (j + 1 < n) {
                        tauler[i][j + 1].setMines(tauler[i][j + 1].getMines() + 1)
                    }
                    if (i + 1 < n && j - 1 >= 0) {
                        tauler[i + 1][j - 1].setMines(tauler[i + 1][j - 1].getMines() + 1)
                    }
                    if (i + 1 < n) {
                        tauler[i + 1][j].setMines(tauler[i + 1][j].getMines() + 1)
                    }
                    if (i + 1 < n && j + 1 < n) {
                        tauler[i + 1][j + 1].setMines(tauler[i + 1][j + 1].getMines() + 1)
                    }
                }
            }
        }
    }
    //hiHaMina
    fun hiHaMina(x: Int, y: Int): Boolean {
        if (tauler[x][y].getEsMina()) {
            return true
        }
        return false
    }
    //métoda descobert
    fun descobert(x: Int, y: Int) {
        tauler[x][y].setDescoberta(true)
    }
    //métoda descobreixCasella
    fun descobreixCasella(x: Int, y: Int) {
        if (tauler[x][y].getDescoberta()) {
           println("No pots descubrir una casella descoberta")
        } else if (!tauler[x][y].getDescoberta()) {
            tauler[x][y].setDescoberta(true)
        }else{
            hiHaMina(x,y)
            println("Has perdut")
        }
    }
    //métoda descobreixTauler
    fun descobreixTauler() {
        for (i in 0 until n) {
            for (j in 0 until n) {
                tauler[i][j].setDescoberta(true)
            }
        }
    }
    //métoda descoberta
    fun descoberta(x: Int, y: Int): Boolean {
        if (tauler[x][y].getDescoberta()) {
            return true
        }
        return false
    }
    //métoda marcaMina
    fun marcaMina(x: Int, y: Int) {
        if (tauler[x][y].getDescoberta()) {
            println("No pots marcar una casella descoberta")
        } else if (tauler[x][y].getMinaMarcada()) {
            tauler[x][y].setMinaMarcada(false)
        }else{
            tauler[x][y].setMinaMarcada(true)
        }
     
    }
    //métoda minaMarcada
    fun minaMarcada(x: Int, y: Int): Boolean {
        if (tauler[x][y].getMinaMarcada()) {
            return true
        }
        return false
    }
    //métoda minesDescobertes

    //métoda mostraTauler
    fun mostraTauler(){
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (tauler[i][j].getDescoberta()) {
                    if (tauler[i][j].getEsMina()) {
                        print("# ")
                    } else {
                        print(tauler[i][j].getMines().toString() + " ")
                    }
                } else {
                    if (tauler[i][j].getMinaMarcada()) {
                        print("* ")
                    } else {
                        print(". ")
                    }
                }
            }
            println()
        }
        
   }
   //métode toString
   override fun toString(): String {
         for (i in 0 until n) {
                for (j in 0 until n) {
                 if (tauler[i][j].getDescoberta()) {
                      if (tauler[i][j].getEsMina()) {
                            print("# ")
                      } else {
                            print(tauler[i][j].getMines().toString() + " ")
                      }
                 } else {
                      if (tauler[i][j].getMinaMarcada()) {
                            print("* ")
                      } else {
                            print(". ")
                      }
                 }
                }
                println()
         }
       return TODO("Provide the return value")
   }
}
   
   