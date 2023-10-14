// ?. (safe call operator) : 안전한 호출 연산자

// 코틀린에서는 손쉽게 null 확인 하기 위한 연산자를 제공하고 있다.

fun main(args:Array<String>):Unit {
    var data1: String? = "kotlin"

    var len: Int? = data1?.length
    println(len)

    data1 = null
    len = data1?.length
    println(len)

    len?.let {
        println(it)
    }
}