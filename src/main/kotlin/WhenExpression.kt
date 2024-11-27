fun main() {
testWhen(1)
testWhen("нука-нука")
    testWhen(true)
    testWhen(15)
    testWhen(555)
    testWhen(5.55555)
}

fun testWhen(input: Any){   //Any - означает любой тип данных аналог object в java
when(input){                      //when аналог switch в java
1 -> println("У вас 1")
2 -> println()
    in 10..20 -> println("Вы попали в диапазон от 10 до 20.")
is String -> println("Вы ввели строку длинной в ${input.length} символов.")
    is Boolean -> println("Вы ввели значение  ${input}.")
    is Int -> if (input % 2 ==0) println("Вы ввели четное число.") else println("Вы ввели нечетное число.")
    else -> println("Что вы ввели?")
}
}

// в отличие от java в kotlin не нужно делать приведение типов ( только в отдельных случаях)