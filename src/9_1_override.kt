// 오버라이딩 : 슈퍼클래스의 멤버함수를 서브클래스에서 고쳐서(덮어쓰기) 사용하는 것

// 코틀린에서는 오버라이딩을 하는 경우 반드시 override 키워드를 지정

open class DemoA {
    // 클래스와 마찬가지로 멤버함수도 오버라이딩을 허용하도록 하기위해 open 키워드를 붙여야 한다.
    open fun demoAFunc() = println("demoAFunc 함수...")
}

open class DemoB:DemoA() {
    // override키워드에는 open 키워드 포함
    override fun demoAFunc() {
//        super.demoAFunc() // super는 슈퍼클래스를 의미하는 대명사
        println("DemoBFunc 함수........")
    }
}

open class DemoC:DemoB() {
    // 재 오버라이등을 허용하지 않도록 할 떄 final 키워드를 이용한다.
    final override fun demoAFunc() {
        println("Hello!!")
    }
}

//class DemoD:DemoC() { // 컴파일 에러
//    override  fun demoAFunc() {
//
//    }
//}

fun main(args:Array<String>):Unit {
    DemoA().demoAFunc()
    DemoB().demoAFunc()
}