package Chapter2

fun getName():String?{

    return null
}

fun main(args: Array<String>) {
    val name:String= getName() ?:return
    println(name.length)

    val value:String?="HelloWorld"
    println(value!!.length)
}