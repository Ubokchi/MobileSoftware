package ddwu.com.mobile.week10.foodexam

data class FoodDto(val photo: Int, var food : String, var count: Int) {
    override fun toString() = "$food ($count)"
}
