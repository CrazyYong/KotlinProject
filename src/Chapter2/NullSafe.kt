package Chapter2

/**
 * 空类型安全
 */
fun getName():String?{

    return null
}

fun main(args: Array<String>) {

    val value:String?="HelloWorld"
    println(value!!.length)

    val str:String?=null
    println("is null $str")

    val name:String= getName() ?:return
    println(name.length)

}