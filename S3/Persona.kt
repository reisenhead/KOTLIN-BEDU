package S3

class Persona (val name:String,val apellidos: String, val sexo: String,val altura: Float) {

    init {
        println("""
            valor edición: 
            nombre: $name,
            apellidos: $apellidos,
            sexo: $sexo,
            altura: $altura
        """.trimIndent())
    }
}