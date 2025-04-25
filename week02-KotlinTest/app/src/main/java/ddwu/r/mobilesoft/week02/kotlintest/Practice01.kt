package ddwu.r.mobilesoft.week02.kotlintest

fun main() {
    print("키를 입력하시오. (cm 단위): ")
    var height: Float = readLine()!!.toFloat() / 100
    print("몸무게를 입력하시오. (kg 단위): ")
    var weight: Float = readLine()!!.toFloat()

    val BMI = (weight / (height * height))

    print("키 ${height * 100} cm, 몸무게 $weight kg의 BMI 지수는 $BMI 이며 ")
    if (BMI < 18.5)
        print("저체중입니다.")
    else if (BMI < 23)
        print("정상입니다.")
    else if (BMI < 25)
        print("과체중입니다.")
    else
        print("비만입니댜.")
}