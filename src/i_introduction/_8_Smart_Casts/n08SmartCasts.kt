package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8

// 'sealed' modifier restricts the type hierarchy:
// all the subclasses must be declared in the same file
sealed class Expr

class Num(val value: Int) : Expr()

class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
        when (e) {
            is Num -> todoTask8(e)
            is Sum -> todoTask8(e)
        }

/**
Task 8.
Complete the implementation of the 'eval' function above using smart casts and 'when' expression.
The 'JavaCode8.eval' method provides the similar functionality written in Java.
 */
fun todoTask8(expr: Expr): Int {
    if (expr is Sum) {
        val sum: Sum = expr
        return todoTask8(sum.left) + todoTask8(sum.right)
    } else if (expr is Num) {
        return expr.value
    }
    return 0
}
