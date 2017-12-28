package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            other.year != year -> year - other.year
            other.month != month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}


operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27(this, other)
operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeInterval: RepeatedTimeInterval) = addTimeIntervals(timeInterval.timeInterval, timeInterval.number)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)
class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)


class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterator<MyDate> {
    var current = start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }

    override fun hasNext(): Boolean {
        return current <= endInclusive
    }
}

operator fun DateRange.contains(date: MyDate): Boolean = checkRangIn(this, date)

fun checkRangIn(dateRange: DateRange, date: MyDate): Boolean {
    val a = Calendar.getInstance()
    a.set(date.year, date.month, date.dayOfMonth)

    val b = Calendar.getInstance()
    b.set(dateRange.start.year, dateRange.start.month, dateRange.start.dayOfMonth)

    val c = Calendar.getInstance()
    c.set(dateRange.endInclusive.year, dateRange.endInclusive.month, dateRange.endInclusive.dayOfMonth)

    return a in b..c
}
