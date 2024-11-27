fun main() {
   // for each
    val items = listOf("Я", "и гусь", "за деньги") // функция неизменямого списка
    // mutableListOf() функция изменяемого списка
for (item in items)
    println(item)
println("*******")
        //while
    var index = 0
    while (index < items.size){
        println("${items[index]} это индекс $index")
    index++}
    println("*******")

    // Диапазоны как в python

    val intd= 5..10 //обозначение диапазона
    println(11 in intd) // проверка на вхождение в диапазон
    println("*******")
    for (i in 4..7){
        println(i)
    }
    println("*******")
    for (i in 1 until 6) //диапазон без включения последнего значения
    {
        println(i)
    }
    println("*******")

    for (i in 10 downTo 1) //диапазон в обратной последовательности
    {
        println(i)
    }
    println("*******")
    for (i in 0..100 step 10) //диапазон с указанием шагов
    {
        println(i)}

}
