import java.lang.NullPointerException

fun main(){

    //exercicio 3
    try {
        var a = CalculoMatematico()
        println(a.divisao(4, 0))
    }catch (e:ArithmeticException){
        println("Indivisivel por 0")
    }

    //Exercicio 1
    try{
        var lista:List<String> = mutableListOf("Pato", "Cachorro","Gato")
        println(lista.get(3))
    }catch (e:Exception){
        println("Excessão - Erro porque a posição não existe na lista")
    }


    //exercicio 2
    try {
        var listaExercicio2: MutableList<String>? = null
        listaExercicio2?.add("Pato")
        listaExercicio2?.add("Cachorro")
        listaExercicio2?.add("Gato")
        println(listaExercicio2?.getOrNull(2))
    }catch(e:NullPointerException){
        println("Impossivel pegar uma lista que nao foi inicializada")
    }catch(e:Exception){
        println("Posicao na lista nao existente")
    }


}

class CalculoMatematico(){
    fun divisao(num1:Int, num2:Int):Double = (num1/num2).toDouble()
}

