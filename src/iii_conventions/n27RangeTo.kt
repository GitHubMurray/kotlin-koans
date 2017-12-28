package iii_conventions

import util.TODO
import util.doc26
import java.util.*

/**
Task 27.
Uncomment the commented code and make it compile.
Make all the changes to the file MyDate.kt.

Tips: To make '..' work implement a 'MyDate.rangeTo()' extension function returning 'DateRange'.
 */
fun todoTask27(first: MyDate, last: MyDate): DateRange {
    return DateRange(first, last)
}

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    //return checkUseCalendar(date, first, last)
    return date in first..last
}

fun checkUseCalendar(date: MyDate, first: MyDate, last: MyDate): Boolean {
    val a = Calendar.getInstance()
    a.set(date.year, date.month, date.dayOfMonth)

    val b = Calendar.getInstance()
    b.set(first.year, first.month, first.dayOfMonth)

    val c = Calendar.getInstance()
    c.set(last.year, last.month, last.dayOfMonth)

    return a in b..c
}
