
// 예외는 기본적으로 시스템에 의해서 발생한다.
// 사용자가 고의로 예외를 발생시킬 수 있다. (예외를 던진다)

fun main(args:Array<String>):Unit {
    try {
        callDiv()
    } catch (e:Exception) {
        println(e.message)
    }
}

fun callDiv() {
    val aa = 10
    val bb = 0
    div(aa, bb)
}
/*
    예외를 던질 떄 형식
    throw Throwable 타입 표현식

    Exception은 Throwable을 상속받는다.
 */
fun div(a:Int, b:Int):Int {
    if (b == 0 )
        throw Exception("0으로 나눌 수 없습니다.") // 자기가 예외처리를 하지 않으면 호출한 함수에 예외처리를 던짐
    return a/b
}

