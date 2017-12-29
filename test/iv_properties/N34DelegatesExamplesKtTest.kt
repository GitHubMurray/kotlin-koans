package iv_properties

import org.junit.Assert.*
import org.junit.Test

class N34DelegatesExamplesKtTest {
    @Test
    fun testLazy() {
        var initialized = false
        val lazyProperty = LazyPropertyUsingDelegates({ initialized = true; 42 })
        assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazyValue
        assertTrue("Property should be initialized after access", initialized)
        assertEquals(42, result)
    }

    @Test
    fun initializedOnce() {
        var initialized = 0
        val lazyProperty = LazyPropertyUsingDelegates({ initialized++; 42 })
        lazyProperty.lazyValue
        lazyProperty.lazyValue
        assertEquals("Lazy property should be initialized once", 1, initialized)
    }

    @Test
    fun initializedValue() {
        var initialized = 0
        val lazyProperty = LazyPropertyUsingDelegates({ initialized++; 23 })
        assertEquals("Lazy property value is wrong", 23, lazyProperty.lazyValue)
        lazyProperty.lazyValue = 56
        assertEquals("Lazy property value is wrong", 56, lazyProperty.lazyValue)
    }
}