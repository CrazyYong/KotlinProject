/**
 *Create by cpSir on 2019/3/14
 */

/**
 * 双冒号使用
 * 双冒号操作符 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法
 */

fun main() {
println(lock("param1","param2",::getResult))
}

/**
 * @param str1 参数1
 * @param str2 参数2
 */
fun getResult(str1:String,str2:String):String = "result is {$str1 , $str2}"

/**
 * @param p1 参数1
 * @param p2 参数2
 * @param method 方法名称
 */
fun lock(p1:String,p2:String,method:(str1:String,str2:String)->String):String{
    return method(p1,p2)
}


/**
 * 我们在 Class 中的某个方法中使用双冒号调用当前 Class 的内部方法时调动方式为
 */
class Test1{
    fun isOdd(x: Int) = x % 2 != 0

    fun test() {
        var list = listOf(1, 2, 3, 4, 5)
        println(list.filter(this::isOdd))
    }
}