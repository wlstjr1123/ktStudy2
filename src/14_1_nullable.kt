fun main(args:Array<String>):Unit {
    // ? => null 값을 가질수 있도록 하는 연산자
    // 코틀린은 Nullable타입이 아니면 null을 지정할 수 없다.
    // ?는 Nullable 타입 연산자
    // Nullable타입은 힙메모리에 저장된다.
    // Nothing? => null을 의미

    var human: Human? = Human("홍길동", 30)
    human = null

    var aa:Int? = null
    aa = 100

}