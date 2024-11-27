fun main() {

val a = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

a.forEach{v-> println(v)} // лямбда помещается в фигурные скобки
   println(a.map {v-> v * 2})    //функция отображает элементы в виде других элементов
   println(a.filter {v-> v % 2==0 }) // функция фильтрации
   println(a.reduce{sum, v-> sum+v})      //функция используется для применения операций над элементами (сумма элементов)
    // sum или acc изначально равен первому элементу коллекции, а v(или любое другое обозначение) последующему, далее sum или acc будет равен результату операции и тд

    println(a.reduce{acc, v -> acc * v }) // произведение элементов
    println(a.reduce{acc, v -> if (v > acc) v else acc }) // максимальный элемент массива

    println(a.sortedByDescending { it })  //сортирует по убыванию

    println(a.any{it == 50}) // it это любое значение из коллекции, в данной функции вернется false, так как нет значений равных 50(можно использовать любой знак равенства
    println(a.all{it < 50}) // вернет true, так как все элементы меньше 50
    println(a.sum()) // функция суммирует

val number = listOf<Int>(1,-7,5,-11)
    val(positive, negative) = number.partition { it >0 } //разделение коллекции , в данном случае положительные числа будут в positive, а отрицательные в negative

    println("Позитивные = ${positive}")
    println("Негативные = ${negative}")

    val result = listOf<String>("q","qwerty","ty", "qwe", "qw", "rtyuqi").groupBy { it.length } //группировка по длинне строки
println(result)
}