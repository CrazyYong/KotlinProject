package Chapter2

/**
 *Create by cpSir on 2019/3/18
 * 嵌套类
 * 内部类
 * 匿名内部类
 * 局部类
 */

class Other{
    val numOuther =1

    /**
     * 嵌套类
     */
    class Nested{
        fun init(){
            println("执行了init方法")
        }
    }

    /**
     * 内部类:
     * 声明一个内部类使用inner关键字。
       声明格式：inner class 类名(参数){}
     */
    inner class InnerClass{
        val name ="InnerClass"
        fun init(){
            println("我是内部类")
        }
    }

    /**
     * 匿名内部类
     */
    lateinit private var listener: OnClickListener

    fun setOnClickListener(listener: OnClickListener){
        this.listener=listener
    }

    fun testListener(){
        listener.onItemClick("我是匿名内部类的测试方法")
    }


    /**
     * 局部类
     */
    fun partMethod(){
        var name:String = "partMethod"

        class Part{
            var numPart:Int = 2

            fun test(){
                name="test"
                numPart=5
                println("我是局部类中的方法")
            }
        }

        val part = Part()
        println("name = $name \t numPart = " + part.numPart + "\t numOther = numOther")
        part.test()
        println("name = $name \t numPart = " + part.numPart + "\t numOther = numOther")
    }
}


interface OnClickListener{
    fun onItemClick(str:String)
}

fun main() {
    Other.Nested().init() //外部类.嵌套类().嵌套类方法/属性。在调用的时候嵌套类是需要实例化的
    Other().InnerClass().init() // 调用格式为：外部类().内部类().内部类方法/属性

    // 测试匿名内部类
    val other = Other()
    other.setOnClickListener(object :OnClickListener{
        override fun onItemClick(str: String) {
            //todo
            println(str)
        }
    })

    other.testListener()

    // 测试局部类
    Other().partMethod()
}
    