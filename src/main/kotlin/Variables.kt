import kotlin.math.PI

fun main(args: Array<String>) {
       val test1: String = "Hello" //константа
    var test2: String //переменная
    test2 = "У меня квадратный пуп"
    var test3 = 1 // необязательно писать тип данных, котлин может сам понять
    test3 = 7

    println(test2)
    println(test3)

  val seconds = seconds(1,15,59)
    println(seconds)

    println("Вывести переменную: $test3") // $ может в строке вывода обращаться к переменным или вызывать функции
    println("Функция ${2+2}")
    println("Функция 2: ${PI + test3}")
    }

fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    val totalHours = hours * 3600
    val totalMinutes = minutes * 60
    return totalHours + totalMinutes + seconds}