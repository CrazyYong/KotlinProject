package Chapter3

import Chapter2.arg1

/**
 * 重载运算符
 */
class Complex(var real:Double,var imaginary:Double) {
    operator fun plus(other:Complex):Complex{
     return Complex(real+other.real,imaginary+other.imaginary)
    }

    override fun toString(): String {
        return "$real+${imaginary}i"
    }
}

data class Point(val x:Int,val y:Int){
    //使用operator关键字声明plus函数
    //用于重载运算符的所有函数都需要用它operator标记，表示约定而不是同名函数
    operator fun plus(other:Point):Point{
        println("x:$x--y:$y")
        println("other.x:${other.x}--other.y:${other.y}")

        return Point(x+other.x,y+other.y)
    }

    operator fun unaryMinus():Point{
        //坐标取反
        return Point(-x,-y)
    }

}

/*中缀表达式*/
infix fun Int.add(x:Int):Int{
    return this+x
}

/*带命名的参数 参数可以有默认值当省略相应的参数时使用默认值。与其他语言相比，这可以减少重载数量*/
fun foo(arg1:String="Hello Kotlin",arg2:Boolean,arg3:Int){
    println("arg1=$arg1\narg2=$arg2\narg3=$arg3")
}

/*可变参数数量的函数*/
fun variableFun(vararg args:Int){
    for (arg in args){
        println(arg.toString()+",")
    }
}

fun main(args: Array<String>) {
    val c1=Complex(3.0,4.0)//3+4
    val c2=Complex(2.0,7.5)//2+7.5i
    println(c1+c2)

    val p1=Point(10,20)
    val p2=Point(20,30)
    println(p1+p2)

    val p3=Point(10,20)
    println(-p3)

    val value=2 and 3
    println("the value is $value")

    foo(arg2=true,arg3 = 4)

    variableFun(1,2,4)
}