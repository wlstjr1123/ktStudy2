fun main(args:Array<String>):Unit {
    val human = Human2()
    human.age = -10 // age의 setter가 순간적으로 동작
    println(human.age) // age의 getter가 순간적으로 동작
}