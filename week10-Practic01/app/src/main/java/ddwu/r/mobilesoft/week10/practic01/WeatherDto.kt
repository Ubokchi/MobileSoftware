package ddwu.com.mobile.week10.foodexam

data class WeatherDto(val no: Int, var dong : String, var loc: String, var weather: String) {
    override fun toString() = "$dong ($loc): $weather"
}
