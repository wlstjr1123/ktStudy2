

// Nothing 타입은 함수가 정상적으로 끝나지 않는다는 것을 나타내기 위한 특수 타입이다.

// throw Exception() 표현식은 Nothing타입이다. (Nothing == throw Exception()) => 프로그램이 비정상 종료

fun throwing(): Nothing = throw Exception() // 컴파일러가 더이상 실행하지 못하고 종료

// 함수의 반환타입을  Nothing 타입으로 설정하면
// 컴파일러가 정상종료 되지 않는 함수임을 미리 알 수 있다.
fun main(args:Array<String>):Unit {
    println("프로그램 시작")
    var a:Int = throwing() // Nothing타입은 변수의 타입으로 자동으로 바뀜
    println("프로그램 종료")
}

/*
    val x:Int = if (aa >= 0) aa else throw Exception("aa는 음수")
 */