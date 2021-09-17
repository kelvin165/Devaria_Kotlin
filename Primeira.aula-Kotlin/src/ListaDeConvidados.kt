import kotlin.coroutines.cancellation.CancellationException

fun main() {
    println("Favor informar o nome do convidado")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome informado não é valido")
        return
    }
    println("Favor informar a idade do convidado:")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0) {
        println("A idade informada não é valida")
        return
    }
    println("Favor informar a cidade:")
    val cidade = readLine()

    if (cidade.isNullOrEmpty()|| cidade.isNullOrBlank()){
        println("Cidade não é valida!")
        return

    }

    var estaconvidado = false
        when(nome){
            "Kelvin" -> estaconvidado = true
            "hadassa" -> estaconvidado = true
            "matheus" -> estaconvidado = true
            else -> estaconvidado = false
        }

if(estaconvidado && idade >= 18) {
    println("Bem vindo a festa Kotlin Devaria 2021")
}else if (estaconvidado == false){
        println("você não esta na lista de convidados, verifique com a pessoa que o convidou")
} else{
    println("você nao tem 18 anos para entrar na festa")
    }



    }