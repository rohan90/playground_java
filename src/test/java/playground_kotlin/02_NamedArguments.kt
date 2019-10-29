package playground_kotlin

fun joinOptions(options: Collection<String>) = options.joinToString(", ", "[", "]")

fun main() {
    println(joinOptions(mutableListOf("1", "2", "3")))
}