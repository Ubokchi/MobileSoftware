package ddwu.r.mobilesoft.week02.kotlintest

class MyClass {
    var dept: String

    constructor(dept: String) {
        this.dept = dept
    }

    fun getDept() {
        println(dept)
    }
}

fun main() {
    val myObject: MyClass = MyClass("Computer")
    myObject.getDept()
}