package Chapter2

val string:String="HelloWorld"
val fromChars:String=String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))

val arg1:Int=1
val arg2:Int=2

val salary=1000

fun main(args: Array<String>) {
    /*对比的是值*/
    println(string == fromChars)
    /*对比的是对象*/
    println(string === fromChars)

    /*字符串模板*/
    println("$arg1+$arg2=${arg1 + arg2}")

    /*Hello "Trump"*/
    println("Hello\"Trump\"")

    /*$salary"*/
    println("\$salary")

    val rawString:String="""
        \t
        \n
        $salary
        """
    println(rawString)
    println(rawString.length)
}