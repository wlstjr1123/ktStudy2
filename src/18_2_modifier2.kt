// 코틀린에서는 변수가 프로퍼티이다.
// 즉, 변수는 getter/setter를 포함한다.

class AccessPropertyTest {
    private var data: Int = 100

    fun getData():Int {
        return data
    }
}



fun main(args:Array<String>):Unit {
    val obj = AccessPropertyTest()
//    obj.data = 1;
    println("${obj.getData()}");

    val obj2 = AccessPropertyTest2()
//    obj2.data = 20 // 접근 불가.
    println("${obj2.data}") // get은 접근 가능

    val obj3 = Exasdef()
    obj3.name = "안녕"
    println(obj3.name)
}

class AccessPropertyTest2 {

    // 아래의 data 프로퍼티는 접근제한자 없다. 따라서, public 지정되었음.
    // get()함수도 public이 적용된다.
    // set()함수는 private이 지정되어 있음.
    // 따라서 외부에서는 아래의 변수를 마음대로 바꿀수 없음
    var data: Int = 100
        private set(value) {
            field = value;
        }
        get() {
            return field
        }
}

class Exasdef {
    var name:String = ""
    get() = field
    set(value) {field = value}
}

//** get()함수(getter)는 프로퍼티의 접근제한자와 항상 같다.
//** set()함수(setter)는 프로퍼티의 접근제한자와 다르게 설정할 수 있다.
// 단, 접근 범위를 넓혀서 설정할 수는 없다.
// 예>> private val data = 100 이 경우 setter는 public은 허용안됨
//      val data = 100일 경우 setter는 private 선언이 가능하다.
//      protected val data = 100는 setter는 private,protected 가능