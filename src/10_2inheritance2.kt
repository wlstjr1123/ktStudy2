// 클래스 없이 특정한 클래스를 상속받는 객체 만들기

open class ParentClass(val name:String, val age:Int) {
    open fun output() {
        println("이름: $name")
        println("나이: $age")
    }

}

fun main(args:Array<String>):Unit {
    val childClass:ParentClass = object:ParentClass("김말똥", 43)
    {
        override fun output() {
            println("ParentClass를 오버라이딩한 함수... ...")
        }
    }

    childClass.output()
    println(childClass.age)
    println(childClass.name)
}