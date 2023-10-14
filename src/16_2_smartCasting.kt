// is 연산자 : 타입을 확인하는 연산자
// java의 경우 instanceof와 비슷하다

fun smartCast(data: Any): Int {
    if(data is Int) return data * data
    else return 0
}

fun main (args:Array<String>):Unit {
    println("result: ${smartCast(100)}")
    println("result: ${smartCast(11.1)}")
}