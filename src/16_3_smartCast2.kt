class MyClass1 {
    fun fun1() {
        println("fun1() 호출....")
    }
}

class MyClass2 {
    fun fun2() {
        println("fn2() 호출....")
    }
}

fun smartCast2(any: Any) {
    if (any is MyClass1) any.fun1()         // Any 타입은 fun1()이라는 멤버함수는 없지만 is를 통해 스마트 캐스팅이 되어서 MyClass1타입이 됨
    else if (any is MyClass2) any.fun2()
}

fun main(arga:Array<String>):Unit {
    val myClass1 = MyClass1()
    smartCast2(myClass1)

    val myClass2 = MyClass2()
    smartCast2(myClass2)
}