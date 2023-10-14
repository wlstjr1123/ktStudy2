// !! : Not-Null 단정 연산자(Not null Assertion Operator)
// !!연산자는 Nullable 타입을 Not-null 타입으로 강제로 캐스팅(형변환)한다.

class ProductNotNull {
    var name = ""
    var rdate = ""
    var price = 0

    fun print() {

    }
}

fun main(args:Array<String>):Unit {
    var product:ProductNotNull? = ProductNotNull()
    product!!.name = "책상" // null을 무시
    println(product.name)

    product = null
    product!!.print() // 실행 중에 예외가 발생함 (kotlinNullPointerException)
}