package iv_properties

import util.TODO
import util.doc34
import kotlin.reflect.KProperty

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    var lazyValue: Int by Delegate(initializer)
}

class Delegate(val initializer: () -> Int) {
    var value: Int? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("$thisRef, thank you for delegating '${property.name}' to me!")
        if (value == null) {
            this.value = initializer()
        }
        return this.value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
        this.value = value
    }
}

fun todoTask34(): Lazy<Int> = TODO(
        """
        Task 34.
        Read about delegated properties and make the property lazy by using delegates.
    """,
        documentation = doc34()
)
