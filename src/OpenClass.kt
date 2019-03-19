/**
 *Create by cpSir on 2019/3/19
 * 继承类
 *定义继承类的关键字为：open。不管是类、还是成员都需要使用open关键字。
 * open class 类名{
        ...
        open var/val 属性名 = 属性值
        ...
        open fun 函数名()
        ...
        }
 */

open class Demo{
    open var num=3

    open fun foo() ="foo"

    open fun bar() ="bar"
}

class DemoTest:Demo(){
    override var num: Int
        get() = super.num
        set(value) {}
}


fun main() {
    println(DemoTest().num)
    DemoTest().foo()
    DemoTest().bar()
}
    