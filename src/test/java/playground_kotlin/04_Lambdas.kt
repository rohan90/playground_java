package playground_kotlin

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

fun main(){
    println(containsEven(mutableListOf(1,3,5)))
    println(containsEven(mutableListOf(1,3,5,6)))
}