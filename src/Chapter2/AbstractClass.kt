package Chapter2

/**
 *Create by cpSir on 2019/3/18
 * 抽象类
 */

open class Base{
    open  fun init(){}
}

abstract class Language:Base(){
    val TAG=this.javaClass.simpleName //自身的属性

    //自身的函数
    fun test():Unit{

    }

    abstract var name:String //抽象属性
    abstract override fun init()      //覆写父类的方法

    abstract class Name(){}  // 嵌套抽象类
}


/**
 * 抽象类Lanauage的实现类TestAbstarctA
 */
class TestAbstractA:Language(){
    override var name: String
        get() = "Kotlin"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

/**
 * 抽象类Lanauage的实现类TestAbstarctB
 */
class TestAbstarctB : Language(){
    override var name: String
        get() = "Java"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

fun main(args: Array<String>) {
    // val lanauage = Lanauage() 是错误的，因为抽象类不能直接被实例化

    val mTestAbstractA = TestAbstractA()
    val mTestAbstarctB = TestAbstarctB()

    println(mTestAbstractA.name)
    mTestAbstractA.init()

    println(mTestAbstarctB.name)
    mTestAbstarctB.init()

}



    