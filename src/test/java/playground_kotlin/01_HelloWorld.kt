package playground_kotlin

fun start(): String = "OK"

fun printMessage(message: String = start()):String{
    return message
}
fun main() {
    println("hello world..." + start())
    println("print message..." + printMessage("hello"))
    println("print message..." + printMessage())
}