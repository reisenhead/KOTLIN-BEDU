package S4

open class Koopa(name: Any?, strength: Any?) :
    Enemy("Koopa", 2){

    init {
        println("iniciando subclase de ${this.name}")
    }

    private var state = "Walking"

    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado es $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}
