package playground_kotlin

import java.util.*

/**
 * Single Abstract Method
 */

fun getListSAM(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y-x })
    return arrayList
}

fun main(){
    println(getListSAM())
}