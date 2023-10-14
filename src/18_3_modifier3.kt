// 주생성자, 보조생성자 에도 접근 제한자를 사용할 수 있다.

// 생성자의 기본 접근제한자는 public이다.
// 생성자에는 protected 제한자를 지정할 수 없다.

// 주생성자에 접근제한자를 지정하려면 constructor 키워드를 생략하지 않고 그 앞에 지정한다.

class ConstructorClass private constructor(var name: String) {
    var id = 0;

    constructor(name: String = "11", id: Int) : this(name)
}

fun main(args:Array<String>):Unit {
    val a = ConstructorClass(id = 1);
    println(a.name);
}