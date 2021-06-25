package S3

/*class Phone{

    var isOn = false

    //métodos
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getTurn(){
        val turnMode = if(isOn) "Encendido" else "Apagado"
        println("el teléfono esta $turnMode")
    }
}*/
/*
 fun main() {
    val myVehiculo = Vehiculo()
    myVehiculo.color="Verde"
    myVehiculo.marca="Ford"
    myVehiculo.modelo="Focus"
    myVehiculo.placas="REM-4123"

    println("El coche es color: ${myVehiculo.color}, Marca: ${myVehiculo.marca}, Modelo : ${myVehiculo.modelo}, con Placas ${myVehiculo.placas}")

    println("El coche está prendido? ${myVehiculo.encendido}")
    myVehiculo.encender()
    println("El coche está prendido? ${myVehiculo.encendido}")

    println("El tanque tiene ${myVehiculo.gasolina}")
    myVehiculo.recargar(20.07f)
    println("El tanque tiene ${myVehiculo.gasolina}")
 }*/



/*
class Vehiculo {
    var color= ""
    var marca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false


    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }
}*/
/*
class Person (val name:String,val apellidos: String, val sexo: String,val altura: Float) {

    init {
        println("""
            valor edición: 
            nombre: $name,
            apellidos: $apellidos,
            sexo: $sexo,
            altura: $altura
        """.trimIndent())
    }
}*/
/*
    fun main(){

        val persona = Persona(
            "Crystian",
            "Hernandez",
            "Masculino",
            1.702f)


    }

*/
//ejemplo 3
/*
class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    private var lives = 3 //uno empieza el juego con tres vidas

    //resta una vida al jugador
    private fun die(){
        lives--
        println("Has perdido una vida!")
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")

        }
    }
 }

import clases.Mario

fun main(){

    var mario = Mario()

    mario.collision("Pipe")
    //mario.collision("Goomba")
    println("Te quedan ${mario.getLives()}")

    for(i in 1..5){ //matando a mario 5 veces
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
}

private fun die(){
    lives--
    println("Has perdido una vida!")
}

fun getLives(): String{
    return "$lives vidas"
}

*/

/*fun main() {

    val mario = Mario()
/*
    for(i in 1..5){
        mario.collision("Goomba")
        println("Tienes: ${mario.getLives()}")
    }*/


   /* if(mario.isAlive){
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }*/
    //mario.collision("Goomba")

    mario.collision("Star")
}
*/
