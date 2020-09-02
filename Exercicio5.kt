package exercicios

fun main(){
    print(verificaQuatroNumeros(1,5,3,4))
}

fun verificaQuatroNumeros(numA:Int,numB:Int,numC:Int,numD:Int) :Boolean{
    return (numA>numC && numA>numD) || (numB>numC && numB>numD)

}