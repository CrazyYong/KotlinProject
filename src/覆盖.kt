/**
 *Create by cpSir on 2019/3/19
 */

open class A{
    open fun test1(){ println("基类A中的函数test1()") }

    open fun test2(){println("基类A中的函数test2()")}
}

interface B{
    fun test1(){ println("接口类B中的函数test1()") }

    fun test2(){println("接口类B中的函数test2()")}
}

class C : A(),B{
    override fun test1() {
        super<A>.test1()
        super<B>.test1()
    }

    override fun test2() {
        super<A>.test2()
        super<B>.test2()
    }
}

fun main() {
    var c:C=C()
    c.test1()
    c.test2()
}