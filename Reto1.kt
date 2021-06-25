/*fun main(){

    val base = 20f
    val altura =4f
    val ancho = 2f
    val volumen = volumenPrisma(base,altura,ancho)

    val area = areaderectangulo(base, altura)
    println("PUNTO 1")
    println("El area del rectangulo es : $area")
    println("")
    println("PUNTO 2")
    println("El volumen del prisma es: ${volumenPrisma(base,altura,ancho)}")
    println("")

    println("PUNTO 3")
    imprimir()
    println("valor cambiado:   ${imprimir(valor2="Reemplazo del segundo valor")}")
    println("")

    val promedio = promedio(tercera = 10f)
    println("PUNTO 4")
    println("El promedio es :  $promedio")
    println("")
    println("PUNTO 5")
    println("El promedio es :  $promedio")
    println("")
    /*println("PUNTO 6")
    var promedio1:int
    promedio1=$promedio
    println("El promedio es :  $promedio1")
    println("")
}*/



}

fun imprimir(valor: String = "Este es el primer valor por defecto",
             valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}
fun areaderectangulo(base: Float, ancho: Float):Float{
    return base*ancho
}

fun volumenPrisma(base: Float, ancho: Float, altura: Float):Float {
    return base*ancho*altura
}


fun promedio(primera: Float = 8F, segunda: Float = 8F, tercera: Float): Float{
    return (primera + segunda + tercera)/3f
}
*/
/*
fun main() {
    println("Dame el valor del lado1 del rectangulo")
    var ladouno=readLine()?.toInt()
    println("Dame el valor del lado2 del rectangulo")
    var ladodos=readLine()?.toInt()
    println("Dame el valor del lado3 del rectangulo")
    var ladotres=readLine()?.toInt()

    println("${tipoDeTriangulo(lado1 = ladouno, lado2 = ladodos, lado3 =ladotres)}")
}
fun tipoDeTriangulo(lado1: Int?, lado2: Int?, lado3: Int?) {

    if(lado1==lado2 && lado2==lado3){
        println("Es un triángulo equilátero")
    } else if(
        (lado1==lado2 && lado3!=lado1 ) ||
        (lado2==lado3 && lado1!=lado2 ) ||
        (lado3==lado1 && lado2!=lado3) ){
        println("Es un triángulo isóceles")
    } else{
        println("Es un triángulo escaleno")
    }
}*/
/*fun main() {

    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan"
    )
    fun countName(name: String): Int{
        var count = 0
        for(currentName in nombres){
            if(name in currentName){
                count++
            }
        }
        return count
    }
    val nameCount = countName("Juan")
    println("Tu nombre se encontró $nameCount veces")
}


*/