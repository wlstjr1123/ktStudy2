// 다형성(Polymorphism) : 하나의 메소드나 클래스가 있을 떄 이것들이 다양한 방법으로 동작하는 것

open class SuperClass {
    open fun greeting() = println("Hello!!")
}

class SubClass:SuperClass() {
    override fun greeting() = println("Hi!!")
}

fun main(args:Array<String>):Unit {
    val superClass = SuperClass()
    val subClass = SubClass()
    val superClass1:SuperClass = subClass

    superClass.greeting()
    subClass.greeting()
    superClass1.greeting() // Hi!! 출력

}

