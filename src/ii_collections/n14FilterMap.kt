package ii_collections

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

/**
Common task for working with collections.
Look through the Shop API, which all the tasks are using.
Each individual task is described in the function name and the comment.
 */
fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
    return this.customers.map { c -> c.city }.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    return this.customers.filter { c -> c.isFrom(city) }.toList()
}


