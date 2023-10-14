// 보조 생성자 : 여러 개의 생성자를 정의하는 방법

/*
    주 생성자
    class 클래스이름 constructor(매개변수)
    {
        // 보조 생성자1
        constructor(매개변수):this(인수
        { ... }

        // 보조 생성자2
        constructor(매개변수):this(인수)
        { ... }
    }
 */

class Demo2(val second:Int) {
    init {
        println("init 블록 실행...")
    }

    // 보조 생성자1
    constructor(minute: Int, second: Int):this(minute*60 + second) { // this => Demo2에 있는 주 생성자를 호출
        println("보조 생성자1 실행 중...")
    }

    // 보조 생성자2
    constructor(hour:Int, minute: Int, second: Int):this(hour * 60 + minute, second) { // 보조 생성자2를 호출
        println("보조 생성자2 실행 중...")
    }

    init {
        println("another init 블록 실행 중...")
    }
}

fun main(args:Array<String>):Unit {
    println("${Demo2(3).second}")
    println("${Demo2(10, 3).second}")
    println("${Demo2(10, 3, 10).second}")
}