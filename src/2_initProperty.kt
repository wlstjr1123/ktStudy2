// 생성자 정의와 프로퍼티 선언를 한번에 정의하기
class Car(val name:String, val speed:Int = 120) {

}

fun main(args:Array<String>):Unit {
    val car = Car("그랜저", speed = 200)
    println(car.speed)
    println(car.name)
}
