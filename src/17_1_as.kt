// as 연산자를 이용한 다운 캐스팅
// 다운 캐스팅은 Upcasting의 반대 개념이다,

open class Super {
    fun superFunc() {
        println("superFunc() 호출...")
    }
}

class Sub1 : Super() {
    fun subFunc1() {
        println("subFunc1() 호출....")
    }
}

class Sub2 : Super() {
    fun subFunc2() {
        println("subFunc2() 호출...")
    }
}

// as 사용 형식
// 객체 as 타입
// as를 이용한 캐스팅은 상속 관계에 있는 클래스끼리만 가능하다.
// Upcasting 했던 객체를 다시 원래 타입으로 변환 할 때만 사용할 수 있다.


fun main(args:Array<String>):Unit {
    val obj1: Super = Sub1()
    val obj2: Sub1 = obj1 as Sub1 // 원래 하위타입에서 상위타입으로 같다가 다시 하위타입으로 다운캐스팅은 가능 (하 -> 상 -> 하)

    obj2.superFunc()
    obj2.subFunc1()

//    val obj3: Sub1 = Super() as Sub1 // 오류 발생 (상위타입을 바로 다운캐스팅은 가능하지 않음 (상 -> 하)  런타임 에러
//    obj3.subFunc1()

//    val obj4: Sub2 = Sub1() as Sub2 // 상속관계가 아닌 완전히 다른 객체를 캐스팅하는 것은 불가능 런타임 에러
//    obj4.subFunc2()

    val obj5: Super? = Sub1()
    val obj6: Sub1 = obj5 as Sub1
    obj6.subFunc1()

//    val obj7: Super? = null
//    val obj8: Sub1 = obj7 as Sub1 // 런타임 에러 발생(TypecastException)
//    obj6.subFunc1()

    // as? nullable 타입인 경수 null값이 들어오면 nul을 반환하고, 정상적인 객체가
    // 들어오면 정상적으로 캐스팅을 한다.
    val obj9: Super? = null
    val obj10: Sub1? = obj9 as? Sub1
    println(obj10.toString())
}