package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    return this.customers.filter { customer -> moreUndelivered(customer.orders) }.toSet()
}

fun moreUndelivered(orders: List<Order>): Boolean {
    val (delivered, undelivered) = orders.partition { it.isDelivered }
    println("find the order is ${delivered.size} and ${undelivered.size}")
    return delivered.size < undelivered.size
}


