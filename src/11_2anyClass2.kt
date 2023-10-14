// Any클래스를 이용한 다형성

class Product3(val name:String="", val price:Int = 0) {
    override fun toString():String =
        "상품명:${this.name}" + "가격: ${this.price}"
}

fun main(args: Array<String>): Unit {
    val product2 = Product2("랩탑", "18/10/11", 800000)
    getProductInfo(product2)

    val product3 = Product3("책상", 2000000)
    getProductInfo(product3)
}

fun getProductInfo(any:Any) {
    println(any.toString() as Any)
}