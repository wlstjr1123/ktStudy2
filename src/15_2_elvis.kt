// ?: - 엘비스 연산자(Elvis Operator)
// 엘비스 연산자 왼쪽의 피연산자가 null이 아니면 그 값을 그대로 쓰고, null이면
// 오른쪽 피연산자로 사용

fun main(args:Array<String>):Unit {
    val aa:Int? = null
    println(aa ?: 0)

    val bb:Int? = 20
    println(bb ?: 0)
}

/*
    자바의 경우
    String str;

    (str != null)? str : "kotlin";
 */