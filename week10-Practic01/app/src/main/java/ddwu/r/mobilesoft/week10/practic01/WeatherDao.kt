package ddwu.com.mobile.week10.foodexam

class WeatherDao {

    val weathers = ArrayList<WeatherDto>()

    init {
        weathers.add( WeatherDto(1, "하월곡동", "서울시 성북구", "좋음") )
        weathers.add( WeatherDto(2, "압구정동", "서울시 강남구", "보통") )
        weathers.add( WeatherDto(3, "신사동", "서울시 강남구", "나쁨") )
    }

}