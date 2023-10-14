// [] 연산자 : Indexed Access Operator

class Person(var name:String, var birthday:String) {

    operator fun get(position:Int):String {
        return when(position) {
            0 -> name
            1 -> birthday
            else -> "몰라요"
        }
    }

    operator fun set(position:Int, value:String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }

    }
}

fun main(args:Array<String>):Unit {
    val person = Person("김말똥", "1998-04-20")

    println(person[0]) // 실제 처리되는 코드 person.get(0)
    println(person[1]) // 실제 처리되는 코드 person.get(1)

    person[0] = "홍길서" // 실제 처리되는 코드 person.set(0, "홍길서")
    println(person.name)

    person[1] = "1980-11-11" // 실제 처리되는 코드 person.set(1, "1980-11-11")
    println(person[1])
    println(person[2])
}
