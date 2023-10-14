// equals() 메소드는 Any 클래스에 있는 맴버 함수이다.
// 따라서 모든 클래스는 equals()함수를 가지고 있다.
// equals() 는 연산자 == 와 같다.

class Shape {
    var x: Int = 0
    var y: Int = 0
    var name: String = "Rect"

    fun draw() {
        println("도형 : $name, 위치 : ($x, $y)")
    }
}

fun main(args:Array<String>):Unit {
    val shape1: Any = Shape()
    val shape2: Any = Shape()
    val shape3 = shape1

    println("shape1.equals(shape2) is ${shape1.equals(shape2)}")
    println("shape1.equals(shape3) is ${shape1.equals(shape3)}")
}