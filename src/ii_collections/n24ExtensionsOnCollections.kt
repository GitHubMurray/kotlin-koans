package ii_collections


/**
Task 24.
The function should do the same as '_24_JavaCode.doSomethingStrangeWithCollection'.
Replace all invocations of 'todoTask24()' with the appropriate code.
 */
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> s.length }

    return groupsByLength.values.maxBy { group -> group.size }
}