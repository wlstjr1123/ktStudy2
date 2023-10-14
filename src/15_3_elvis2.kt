fun main(args:Array<String>):Unit {
    var aa:String? = "홍길동"

    var len: Int = if(aa != null) {
        aa.length
    } else {
        -1
    }
    println(len)

    aa = null
    len = aa?.length ?: -1
    println(len)

    aa ?: println("aa는 null 입니다.")
}