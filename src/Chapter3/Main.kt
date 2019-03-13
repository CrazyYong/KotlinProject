package Chapter3

val FINAL_HELLO_WORLD:String="HelloWorld"//final
var helloWorld:String="HelloWorld"

val FINAL_HELLO_CHINA="HelloChin"//类型推导


fun main(args: Array<String>) {//(Array<String> -> Unit)

    helloWorld="HelloChina"
    println(FINAL_HELLO_CHINA)
    println("hello ${args[0]}")

    println(int2Long(2))

    println(sum2(1,2))
    println(sum2.invoke(1,2))

    forEachTest(arrayOf("我","是","码农"))

}


fun forEachTest(args:Array<String>){
    args.forEach (::println)

}//(Array<String> -> Unit)

fun sum(arg1:Int,arg2:Int)=arg1+arg2

/*匿名函数*/
val int2Long=fun(x:Int):Long{
    return x.toLong()
}//(Int)->Long

val printlnHello = {
    println("Hello")
}//()->Unit


/*Lambda表达式*/
val sum2={arg1:Int,arg2:Int->
    println("$arg1+$arg2=${arg1+arg2}")
    arg1+arg2
}
