// Getter/Setter 오버라이딩을 할 수 있다.

open class Parent {
    open var aa = 10
        get() {
            println("Parent aa Getter 호출...")
            return field
        }
        set(value) {
            println("Parent aa Setter 호출...")
            field = value
        }
}

class Child : Parent() {
    override var aa: Int
        get() {
            println("Child aa Getter 호출...")
            return super.aa
        }
        set(value) {
            println("Child aa Setter 호출...")
            super.aa = value
        }
}

fun main(args:Array<String>):Unit {
    val child = Child()
    child.aa = 100
    println(child.aa)
}