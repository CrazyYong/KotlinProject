package Chapter3

val FINAL_HELLO_WORLD:String="HelloWorld"//final
var helloWorld:String="HelloWorld"

val FINAL_HELLO_CHINA="HelloChin"//类型推导


fun main(args: Array<String>) {//(Array<String> -> Unit) 没有返回值其实事Unit类型

    helloWorld="HelloChina"
    println(FINAL_HELLO_CHINA)
    println("hello ${args[0]}")

    println(int2Long(2))


    println(sum2(1,2))
    println(sum2.invoke(1,2)) //invoke运算符重载

    forEachTest(arrayOf("我","是","码农"))

    forEachTest2(arrayOf("a","b","q","d"))

}

//具名函数，有名字的函数
fun printUsage(){
    println("请传入两个整数")//(Any?)->Unit
} //()->Unit


fun forEachTest(args:Array<String>){
    args.forEach (::println)

}//(Array<String> -> Unit)

fun forEachTest2 (args: Array<String>){
    args.forEach ForEach@{//给lambda表达式起名字
        if (it == "q") return@ForEach //终止迭代
        println(it)
    }
    println("The End")
}

fun sum(arg1:Int,arg2:Int)=arg1+arg2

/*匿名函数,如果有一个变量接收一个函数，则该函数不需要名字*/
val int2Long=fun(x:Int):Long{
    return x.toLong()
}//(Int)->Long

val printlnHello = {
    println("Hello")
}//()->Unit


/*Lambda表达式*/
//（Int,Int）-> Int
val sum2={arg1:Int,arg2:Int->
    println("$arg1+$arg2=${arg1+arg2}") //返回Unit类型
    arg1+arg2 //返回Int类型
}