import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// Предполагаем, что функция seconds находится в файле Main.kt
class SecondsTest {

    @Test
    fun testSeconds() {
        // Проверка для 1 часа, 30 минут и 15 секунд
        val result = seconds(1, 30, 15)
        assertEquals(5415, result, "Функция должна возвращать 5415 для 1 часа, 30 минут и 15 секунд")
    }

    @Test
    fun testSecondsZero() {
        // Проверка для 0 часов, 0 минут и 0 секунд
        val result = seconds(0, 0, 0)
        assertEquals(0, result, "Функция должна возвращать 0 для 0 часов, 0 минут и 0 секунд")
    }
}
