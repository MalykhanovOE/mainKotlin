fun main () {  //функции это те же методы, как в java

    println(testSu())  //вызываем функции в main
var intP = testSu1(5,7)
println(intP)
    println(testString(8))

    testArguments(z = 8, y = 1, x = 7) //можно указывать значения для агументов вот так
    for (i in testArguments(z = 8, y = 1, x = 7)) {
        println(i)
    }

    testArgumentsDefault()
    testArgumentsDefault(x = 100) //y останется по умолчанию


println(perGrus("Олег", "Таня"))
    println(goo("зил"))
    println(goo("зил", uppercase = true))

    printEvent(5,6,10,12,667,555,556)
    printEvent(*intArrayOf(1,8,90))  // intArrayOf функция создания массива элементов. Так как мы не можем указать в этой функции аргумент в виде массива. Функция ждет отдельные элементы, можно использовать оператор * перед функцией массива, она передаст каждый элемент массива в виде отдельного элемента

}

fun testSu(): Int {  //пример структуры простой функции без аргументов , такие функции можно писать вот так  - fun testSu(): Int = 7+6
    return 7+6
}

fun testSu1(x: Int, y: Int): Int {  //эту функция так же можно упростить, fun testSu1(x: Int, y: Int) = x+y( даже без указания типа данных, kotlin сам поймет его, не применимо для более сложных функций)
    return x+y
}

fun testString (x: Int): String {
    return "У тебя $x и не больше!"
}

fun testArguments (x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)

}

fun testArgumentsDefault (x: Int = 8, y: Int = 9){  //можем указать аргументы по умолчанию, при вызове без указания аргумента будут использоваться эти значения
    println(x + y) }

    //перегрузка метода, в kotlin можно уложить в 1 функцию, в отличие от java, пример ниже

    fun goo (name: String, number: Int = 42, uppercase: Boolean = false): String
    {
        return (if (uppercase) name.uppercase() else name) + number // uppercase функция верхнего регистра

    }

  fun perGrus (x: String, y: String): String {
    val ps = if (false) x else y
    return ps
}

// vararg это когда в функцию передаем любое количество аргументов

fun printEvent (vararg number: Int) { // vararg используется для передачи бесконечного количества аргументов( можно указать тип данных листом, но можно и так)
    number.forEach { e-> if (e % 2 == 0) println(e) } // forEach сокращение написания цикла for
// использование данной функции выведет только целые числа
}


