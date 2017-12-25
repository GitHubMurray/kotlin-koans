package i_introduction._6_Data_Classes

import util.TODO
import util.doc6

/**
Convert 'JavaCode6.Person' class to Kotlin.
Then add a modifier `data` to the resulting class.
This annotation means the compiler will generate a bunch of useful methods in this class:
`equals`/`hashCode`, `toString` and some others.
The `task6` function should return a list of persons.
 */
fun todoTask6(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

data class Person(val name: String, val age: Int)

fun task6(): List<Person> {
    val result = todoTask6()
    println("the result String is: $result")
    return result
}

