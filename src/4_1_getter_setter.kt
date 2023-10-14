class Human2 {
    var age: Int = 0
        // age프로퍼티의 getter/setter
        get() {
            return field // field를 특수 식별자(프로퍼티 속의 변수를 나타내는 식별자)
        }
        set(value) { // value는 의 프로퍼티 타입과 일치하기 떄문에 생략 가능
            field = if (value >= 0) value else 0 // field = age에 저장되는 식별자
        }

    // val 프로퍼티는 getter만 존재
    // 이유는 초기값이 주어지면 더 이상 값을 변경(Set)할 수 없기 때문이다.

    //** Getter와 Setter를 별도로 지정하지 않으면 다음과 같이 자동으로 지정된다.

    var id: Int = 0
        // 지정하지 않을경우 자동으로 생성되는 코드
        get() {
            return field
        }
        set(value) {
            field = value
        }

}

fun main(args:Array<String>):Unit {
    var human = Human2()

    human.age = -2


    print(human.age)
}