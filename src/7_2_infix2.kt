class FunClass {
    infix fun infixFunc(a:Int):Int {
        println("infixFunc 호출")
        return a * a
    }

    infix fun addStr(str:String):String {
        return "김말똥 $str"
    }
}

fun main(args:Array<String>):Unit {
    val obj = FunClass()

    var aa = obj.infixFunc(100)

    var bb = obj infixFunc 100

    println(aa)
    println(bb)

    var str2 = obj.addStr("안녕!!")

    var str3 = obj addStr str2

    println(str2)
    println(str3)
}