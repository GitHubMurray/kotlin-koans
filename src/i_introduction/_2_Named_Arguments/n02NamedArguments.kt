package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1

// default values for arguments
fun bar(i: Int, s: String = "", b: Boolean = true) {
    println("i is $i,s is $s and b is $b");
}

fun usage() {
    bar(1, b = false)
}

fun todoTask2() {
    usage()
    bar(2, "hello")
    bar(2, "hello",false)
}

fun task2(collection: Collection<Int>): String {
    todoTask2()
    return task1(collection)
}