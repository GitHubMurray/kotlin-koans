package i_introduction._4_Lambdas

fun example(): Boolean {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    return sum(1, square(2)) == 5
}

/**
Task 4.
Rewrite 'JavaCode4.task4()' in Kotlin using lambdas:
return true if the collection contains an even number.
You can find the appropriate function to call on 'Collection' by using code completion.
Don't use the class 'Iterables'.
 */
fun todoTask4(collection: Collection<Int>): Boolean {
    val apply = { x: Int, y: Int, z: Int ->
        x + y == z
    }
    val array = collection.toIntArray()
    return apply(array[0], array[1], array[2])
}

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)