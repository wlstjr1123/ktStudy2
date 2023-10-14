// Any 클래스 : 코틀린에서는 모든 클래스의 부모 클래스가 Any 클래스이다 (최상위 클래스)
// 특정 클래스가 어떤 클래스를 상속 받지 않는다면 자동으로 Any클래스를 상속 받는다.
// 특정한 클래스를 상속받는다 해도 자동으로(간접적으로) Any클래스를 상속 받는거와 같다.
// 따라서, 모든 클래스는 Any클래스를 상속받는다.

/*
    Any클래스의 세가지 멤버함수

    open class Any
    {
        open operator fun equals(other:Any?):Boolean
        open fun hashCode():Int
        open fun toString()>String
    }
 */

class Product2(val name:String ="", // 삼품명
               val rDate:String="",  // 출시일
               val price:Int) {     // 상품 가격

    override fun toString() =
            "삼품명: $name\n" +
            "출시일: $rDate\n" +
            "가격: $price 원"
}

fun main(args:Array<String>):Unit {
    val product = Product2("컴퓨터", "18/3/3", 500000)
    println(product.toString())
}