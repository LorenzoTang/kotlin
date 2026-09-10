import kotlin.test.Test
import kotlin.test.assertEquals

class WorldTest {
    @Test
    fun `greeting returns Hello World`() {
        assertEquals("Hello, World!", World().greeting())
    }
}