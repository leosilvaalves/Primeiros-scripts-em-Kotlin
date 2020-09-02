package exercicios

fun main(){
    print("O número maior é: "+ retornaMaior(3,1,2))
}


fun retornaMaior(n1:Int, n2:Int, n3:Int):Int{
    if(n1>n2 && n1>n3){
        return n1
    }else if(n2>n1 && n2>n3){
        return n2
    }else{
        return n3
    }
}