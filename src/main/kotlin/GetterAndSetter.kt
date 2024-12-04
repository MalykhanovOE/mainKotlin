
//геттеры и сеттеры в котлин в обыденности не нужны, так как можно использовать поля напрямую, но если есть условия для полей(не приватных) подходит 2 способ, а для приватных полей можно использовать функции(получится аналог геттеров и сеттеров как в java) или используя стиль котлин 3 способ
fun main() {
    var p1 = Person1()
    p1.get("Олег")
    p1.set()
    p1.conclusion() // Вывод данных через функции-геттеры/сеттеры (1 способ, аналог Java, подходит для приватных полей).

    p1.o = "нука-нука" // Установка значения через сеттер в стиле Kotlin (2 способ, с проверками).
    println(p1.o) // Получение значения через геттер в стиле Kotlin (преобразует в верхний регистр).

    p1.o = "" // Попытка установить пустое значение (вызовет сообщение из сеттера).
    p1.t = "Уха" // Установка значения через геттер/сеттер с использованием приватного поля (_t).
    println(p1.t) // Вывод значения, сохраненного в приватном поле через публичный геттер.
}

class Person1 {
    private var i: String = "" // Приватное поле для 1 способа (функции-геттеры/сеттеры).

    var o: String = ""
        get() = field.uppercase() // 2 способ: геттер преобразует значение в верхний регистр.
        set(value) { // Сеттер проверяет значение перед установкой.
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Значение не может быть пустым!")
            }
        }

    private var _t: String = "ничего не скажу" // Приватное поле для хранения значения.
    var t: String
        get() = _t // 3 способ: геттер возвращает значение приватного поля.
        set(value) { _t = value } // Сеттер обновляет значение приватного поля.

    fun get(name: String) { // 1 способ: функция-геттер для приватного поля i.
        i = name
    }

    fun set(): String { // 1 способ: функция-сеттер для приватного поля i.
        return i
    }

    fun conclusion() { // Метод для вывода значения приватного поля i.
        println(i)
    }
}