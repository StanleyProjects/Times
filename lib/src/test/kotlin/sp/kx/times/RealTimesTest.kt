package sp.kx.times

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class RealTimesTest {
    @Test
    fun nowTest() {
        val times: Times = RealTimes()
        val t0 = System.currentTimeMillis()
        val t1 = times.now().inWholeMilliseconds
        val t2 = System.currentTimeMillis()
        val message = """
            t0: $t0
            t1: $t1
            t2: $t2
        """.trimIndent()
        assertTrue(t1 in t0..t2, message)
    }
}
