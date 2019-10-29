package playground_kotlin

import java.util.*

/**
 * inner anonymous :)
 */
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}

fun main() {
    println(getList())
}