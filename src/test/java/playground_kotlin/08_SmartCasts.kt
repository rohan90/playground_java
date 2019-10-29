package playground_kotlin

fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Invalid : Expr

fun main() {
    mutableListOf(Num(1), Sum(Num(1), Num(2)),Invalid()).forEach {
        println(eval(it))
    }
}