package ii_collections

import java.util.*

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun example0(list: List<Int>) {
    list.toSet()

    list.toCollection(HashSet<Int>())
}

/**
Common task for working with collections.
Look through the Shop API, which all the tasks are using.
Each individual task is described in the function name and the comment.
 */
fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
    return this.customers.toSet()
//    return this.customers
}

