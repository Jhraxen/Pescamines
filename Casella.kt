class Casella (var descoberta: Boolean = false, var esMina: Boolean = false, var minaMarcada: Boolean = false, var mines: Int = 0) {
    
    fun Casella() {
        descoberta = false
        esMina = false
        minaMarcada = false
        mines = 0
    }
    @JvmName("getEsMina1")
    fun getEsMina(): Boolean {
        return esMina
    }
    @JvmName("setEsMina1")
    fun setEsMina(esMina: Boolean) {
        this.esMina = esMina
    }
    @JvmName("getDescoberta1")
    fun getDescoberta(): Boolean {
        return descoberta
    }
    @JvmName("setDescoberta1")
    fun setDescoberta(descoberta: Boolean) {
        this.descoberta = descoberta
    }
    @JvmName("getMines1")
    fun getMines(): Int {
        return mines
    }
    @JvmName("setMines1")
    fun setMines(mines: Int) {
        this.mines = mines
    }
    @JvmName("getMinaMarcada1")
    fun getMinaMarcada(): Boolean {
        return minaMarcada
    }
    @JvmName("setMinaMarcada1")
    fun setMinaMarcada(minaMarcada: Boolean) {
        this.minaMarcada = minaMarcada
    }
    fun setMarcaMina(minaMarcada: Boolean) {
        this.minaMarcada = minaMarcada
    }

    override fun toString(): String{
        if(this.descoberta){
            if(this.esMina){
                return "#"
            }else{
                return String.format("${getMines()}")
            }
        }else{
            if(this.minaMarcada){
                return "*"
            }
        }
        return "."
    }
}
    
    