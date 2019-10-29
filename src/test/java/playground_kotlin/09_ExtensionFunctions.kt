package playground_kotlin

fun Int.r(): RationalNumber = RationalNumber(this,1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first,second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main(){
    println(2.r())
    println(Pair(2,3).r())
}