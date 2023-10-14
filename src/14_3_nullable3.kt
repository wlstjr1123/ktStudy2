fun main(args:Array<String>):Unit {
    var aa:String? = "hello"

//    val length : Int? = aa.length    // aa 길이가 널이면 의미가 없어 에러

    // ?. 널 확인 연산자
    val length : Int? = aa?.length
    val test : String? = null

    val length1 : Int? = if (aa != null){
        aa.length
    } else {
        null
    }

    print(length)
    print(test)
}