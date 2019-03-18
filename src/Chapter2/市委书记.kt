package Chapter2

class 市委书记 (var 姓:String){

    init {
        println("姓名是:$姓")
    }

    constructor(age:Int,address:String,姓:String):this(姓){

        println("age:$age,address:$address,姓:$姓")


    }

    override fun toString(): String {
        return "${姓}书记"
    }
}

fun main() {
    var s1 = 市委书记("王") //默认调用一级构造函数

    var s2=市委书记(55,"深圳","王") //调用二级构造函数，但是要初始化



}