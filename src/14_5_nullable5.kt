// 객체이 연결구조에도 ?. 연산자를 사용할 수 있다.

class Address {
    val city: String? = "seoul"
}

class NullPerson {
    val address: Address? = Address()
}

fun main(args:Array<String>):Unit {
    val person:NullPerson? = NullPerson()
    println(person?.address?.city) // address / city가 null일수도 있기 때문에 null체크를 한다.
}