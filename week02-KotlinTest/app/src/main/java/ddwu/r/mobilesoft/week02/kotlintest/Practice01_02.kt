package ddwu.r.mobilesoft.week02.kotlintest

data class RegDate(val year: String, val month: String, val day: String) {
    override fun equals(other: Any?): Boolean {
        return other == this.year
    }
}

data class Address(val city: String, val dong: String, val addNo: String)

class Member(val regDate: RegDate, val address: Address) {
    fun getPeriod(regDate: RegDate) {

    }
}

fun main() {
    val date = RegDate("2000", "01", "01")
    val add = Address("서울특별시", "압구정동", "01")
}