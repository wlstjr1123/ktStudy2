// 상속(Inheritance)
// 코틀린은 기본적으로 class의 상속이 막혀 있다.
// (상속에 폐쇄적이다.: 클래스 선언이 final로 되어있음,

// 따라서, 클래스 앞에 open 키워드를 이용해서 상속하도록 해주어야 한다.

// 확장 클래스(상속받는 클래스)의 형식
// open class 슈퍼클래스명    <---- 슈퍼클래스 형식
// class 클래스 이름 : 슈퍼클래스 생성자(인수)

open class Human(val name:String, val age:Int) {

}

class Employee(name:String, age:Int, val id:Int): Human(name, age) {

}

fun main(args:Array<String>):Unit {
    val human = Human("김말똥", 33)
    val employee = Employee("강길동", 29, 20180103)

    val human1:Human = Employee("홍길북", 42, 20160505)
    println(human1.name)
    //    println(human1.id) // 컴파일 에러

    val employee1:Employee = human1 as Employee
    println(employee1.id)
}

// 캐스팅(Casting) : 형변환 (특정한 타입을 다른 타입으로 변환하는 것)
// Upcasting : 서브 클래스의 인스턴스를 슈퍼클래스 타입으로 만드는 것
