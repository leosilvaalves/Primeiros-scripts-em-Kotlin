package exercicios

fun main(){
    val lista1= arrayListOf<String>()
    lista1.add("Leonardo")
    lista1.add("Marcos")
    lista1.add("João")

    val lista2= arrayListOf<String>()
    lista2.add("Leonardo")
    lista2.add("Marcos")
    lista2.add("João")
    var iguais = true
    for(c in 0..lista1.size-1){

        if(lista1[c]!=lista2[c]){
            iguais=false
        }
    }
    print(iguais)
}