package sp.kx.times

import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

class RealTimes : Times {
    override fun now(): Duration {
        return System.currentTimeMillis().milliseconds
    }
}
