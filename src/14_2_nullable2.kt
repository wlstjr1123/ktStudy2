// Null 확인 연산자 -> ?.

var data1: String = "홍길동"

var data2: String? = null

fun myFunc(arg:String) {

}

fun main(args:Array<String>):Unit {
    data2 = "김말똥"

    val data3: String? = data2
//    val data4: String = data2 // 변수가 nullable타입이 아니면 nullable타입의 데이터로 초기화 할 수 없다.
//
//    myFunc(data2)
}