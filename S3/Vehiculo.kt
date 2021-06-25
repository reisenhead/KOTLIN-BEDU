package S3

class Vehiculo{
    var color= ""
    var marca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false

    fun encender(){
        encendido= true
    }

    fun apagar(){
        encendido=false
    }
    fun getTurn(){
        val turnMode = if(encendido) "Encendido" else "Apagado"
        println("El teléfono está $turnMode")
    }
    fun recargar(litros:Float){
        gasolina+=litros
    }
}