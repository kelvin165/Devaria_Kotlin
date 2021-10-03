fun main(Argumentos : Array<String>) {
    // for subindo
    for (indice in Argumentos.indices)
        println("Percorrendo os Argumentos pocisão $indice e valor ${Argumentos[indice]}")
    // for descendo
    for (indiceDecrecente in Argumentos.size-1 downTo 0 )
        println("Percorrendo os Argumentos de forma Decrescente $indiceDecrecente e valor ${Argumentos[indiceDecrecente]}")
    // for each
    for (argumento in Argumentos ){
        println("Percorrendo os Argumentos de foreach valor : $argumento")}
    // for while
var contadordeargumentos = 0
    while (contadordeargumentos < Argumentos.size){
        println("Percorrendo os Argumentos com While Argumentos lidos: ${++contadordeargumentos} " + "Valor lido:${Argumentos[contadordeargumentos-1]}")
    }
// for do while
var ContadorLoopsEfetuados = 0
    do{
        println("Percorrendo os Argumentos com do While, Total de loops: $ContadorLoopsEfetuados " +
                "e Valor lido: ${Argumentos[ContadorLoopsEfetuados]}")
        ContadorLoopsEfetuados++
    }while (ContadorLoopsEfetuados < Argumentos.size)
}