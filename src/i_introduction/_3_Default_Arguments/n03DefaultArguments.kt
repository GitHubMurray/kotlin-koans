package i_introduction._3_Default_Arguments

fun todoTask3(name: String = "", number: Int = 42, toUpperCase: Boolean = false): String {
    var str = ""
    if (toUpperCase) {
        str = name.toUpperCase()
    } else {
        str += name
    }
    str += number

    return str
}

fun task3(): String {
    //a42b1C42D2
    return (todoTask3("a") +
            todoTask3("b", number = 1) +
            todoTask3("c", toUpperCase = true) +
            todoTask3(name = "d", number = 2, toUpperCase = true))
}