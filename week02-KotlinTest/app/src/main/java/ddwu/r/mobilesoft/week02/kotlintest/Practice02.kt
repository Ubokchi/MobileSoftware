package ddwu.r.mobilesoft.week02.kotlintest

import java.util.Random

fun main() {
    val random = Random()
    var nums = mutableSetOf<Int>()

    for (i in 1..6)
        nums.add(random.nextInt(45) + 1)

    println(nums)
}