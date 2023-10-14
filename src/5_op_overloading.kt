// 단항 연산자(unary)
/*
    // d연산자 오버로딩에 가능한 단항 연산자
    표현시           함수이름            컴파일러에서 동작하는 명령
     +a             unaryPlus               a.unaryPlus()
     -a             unaryMinus              a.unaryMinus()
     !a             not                     a.not

     ++a
     --a
     a++
     a--
 */

// 이항 연산자
/*
    a+b             plus                    a.plus(b)
    a-b             minus                   a.minus(b)
    a*b             times                   a.times(b)
    a/b             div                     a.div(b)
    a%b             rem                     a.rem(b)
    &(Modulus Operator)  나머지(remainder)를 구하는 연산자
    a+=b            plusAssign              a.plusAssign(b)
    a-=b            minusAssign             a.minusAssign(b)
    a*=b            timesAssign             a.timesAssign(b)
    a/=b            divAssign               a.divAssign(b)
    a%=b            remAssign               a.remAssign(b)
    a>b             compareTo               a.compareTo(b)>0
    a<b                 "                   a.compareTo(b)<0
    a>=b                "                   a.compareTo(b)>=0
    a<=b                "                   a.compareTo(b)<=0
    a==b            equals                  a?.equals(b)?:(B===null)
    a!=b            equals                  a.?.eqials(b)?:(b===null)
 */

class Point(var x:Int=0, var y:Int=0) {
    // 함수에 operator 키워드를 이용해서 오버로딩을 한다.
    operator fun plus(obj:Point):Point {
        return Point(x + obj.x, y + obj.y)
    }

    operator fun minus(obj:Point):Point {
        return Point(x - obj.x, y - obj.y)
    }


    operator fun times(num:Int):Point {
        return Point(x * num, y * num)
    }

    operator fun div(num:Int):Point {
        return Point(x/num, y/num)
    }

    fun output() {
        println("x: $x, y: $y")
    }
}


fun main(args:Array<String>):Unit{
    val point1 = Point(10, 20)
    val point2 = Point(20, -5)

    val point3 = point1 + point2
    val point4 = point3 * 10
    val point5 = point4 / 5

    point3.output()
    point4.output()
    point5.output()
}





















