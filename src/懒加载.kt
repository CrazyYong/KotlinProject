/**
 *Create by cpSir on 2019/5/30
 */

/**
 * Kotlin中属性在声明得同时也要求被初始化,否则会报错 例如:
 * private var name0: String //报错
   private var name1: String = "xiaoming" //不报错
   private var name2: String? = null //不报错
 */



public class Main{
    /**
     * lateinit只能用于var声明的类变量，并且属性没有自定义getter或setter方法。
     * 属性的类型必须是非空的，并且不能是原始类型。
     */

    /**
     * lazy只能用于val属性
     * 因为它不能应用于final（val）字段，因此不能保证不可变性
     */
    val name2:String by lazy {"Android Coder"}

    private lateinit var name:String

    fun init(){
        name="hhhh"
    }

    fun doNothing(){
        println(name)
    }


}