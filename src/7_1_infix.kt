// 함수의 중위 표현식(Infix Notation)
// 중위 표기법을 사용하기 위해서는 함수 앞에 infix키워드를 지정한다. (infix선언)
// infix선언이 가능한 함수 - 매개 변수가 하나인 함수 or 클래스의 맴버함수 or 클래스의 확장함수


class NewPoint(var x:Int = 0, var y:Int = 0) {

    // 좌표의 차이값을 리턴
    infix fun difference(point3:NewPoint):NewPoint {
        return NewPoint(x - point3.x, y - point3.y)
    }

    fun output() {
        println("x: $x, y: $y")
    }
}

fun main(args:Array<String>):Unit {
//    val pt = NewPoint(20, 30).difference(NewPoint(10, 10))

    val pt = NewPoint(20, 30) difference NewPoint(10, 10)

    pt.output()
}