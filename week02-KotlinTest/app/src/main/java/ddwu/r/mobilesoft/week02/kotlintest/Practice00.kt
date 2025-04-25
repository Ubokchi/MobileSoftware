package ddwu.r.mobilesoft.week02.kotlintest

fun main() {
    val nums = Array<Int>(5) { readLine()!!.toInt() }

    println("총합: ${nums.sum()}")
    println("평균: ${nums.sum() / nums.size}")
}