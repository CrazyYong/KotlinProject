package Chapter2

val arrayOfInt:IntArray= intArrayOf(1,2,34)
val arrayOfChar:CharArray= charArrayOf('H','e','l','l','o','W','o','r','l','d')
val arrayOfString:Array<String> = arrayOf("我","是","码农")
val arrayOf书记:Array<市委书记> = arrayOf(市委书记("章"), 市委书记("赵"), 市委书记("王"))


fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (int in arrayOfInt){
        println(int)
    }

    println(arrayOf书记[1])
    arrayOf书记[1]= 市委书记("方")
    println(arrayOf书记[1])

    println(arrayOfChar.joinToString())
    println(arrayOfChar.joinToString(""))

    println(arrayOfInt.slice(1..2))
}