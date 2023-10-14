class Rectangle constructor(width:Int, height:Int) {
    val width = width
    val height:Int

    init {
        this.height = height
    }

    val size:Int

    init {
        this.size = width * height
    }
}

fun main(args:Array<String>):Unit {
    val rectangle = Rectangle(100, 50)

    println(rectangle.width)
    println(rectangle.height)
    println(rectangle.size)
}