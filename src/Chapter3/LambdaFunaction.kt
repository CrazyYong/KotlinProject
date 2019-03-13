package Chapter3

/**
 * Lambda函数
 */

fun fun1(x:Int,y:Int):Int{
    return x+y
}

/*如果lambda表达式只有一个参数，kotlin可以自己计算出签名，它允许我们不声明唯一的参数，并且隐含的为我们声明其名称为it：*/
fun fun2(str:String,body:(String)->String):String{
    return body(str)
}

/*匿名函数，省略了函数的名称*/
fun String.upper(body:(String)->String):String{
    return body(this)
}


fun transform() {
    "HelloKotlin".upper {
        print(it.toUpperCase())
        return@upper it.toUpperCase()//返回必须加标签限制
        }
    "HelloKotlin".upper(fun(str:String):String{
        return str.toUpperCase()//从匿名函数返回
         })
}

fun operate(x:Int=0,y:Int=0,body:(Int,Int)->Int){
    println("this result is ${body(x,y)}")
}


fun main(args: Array<String>) {
    /*函数参数传入一个函数*/
    operate(3,7,::fun1)
    /*函数参数传入一个lambda表达式*/
    operate(3,7,{x,y->x+y})
    /*函数参数作为函数的最后一个参数，并且传入的是一个lambda表达式，可以在在圆括号外指定*/
    operate(3,7) {
        x,y->x+y
    }
    /*lambda函数字面值只有一个参数，可以省略参数声明，其名称是it*/
    fun2("HelloKotlin"){
        it.toUpperCase()
    }
    /*将匿名函数作为一个函数参数传入*/
    "HelloKotlin".upper(fun(str:String):String{
        return str.toUpperCase()
    })
}