package playground_kotlin

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

fun main(){
    println(compare(MyDate(1000,11,2),MyDate(2000,10,3)))
}