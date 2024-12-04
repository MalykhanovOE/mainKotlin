fun main() {
val ch1 = Person("Михаил", "Малыханов", 5)
    val ch2 = Person("Дизель", "Малыханов", 3)
    val ch3 = Person("Шиша", "Бунденков", 15)
    val p1 = Person("Олег", "Малыханов", 33, ch1)
    val p2 = Person("Татьяна", "Малыханова", 38, ch1)

    p1.children.add(ch2) //можно еще так добавить в список объекта(если не через вторичный конструктор как в примере ниже)
p2.children.add(ch3)

        //println(p1.firsName) // можно выводить напрямую данные из объекта
    ///println(p2.firsName)
    println("Имя:${p1.firsName}\nФамилия:${p1.lastName}\nВозраст:${p1.age}\nДети:")  //вывод данных объекта + списков для объекта
    for (child in p1.children){
        println(child.firsName)
    }
    println("Имя:${p2.firsName}\nФамилия:${p2.lastName}\nВозраст:${p2.age}\nДети:")
    for (child in p2.children){
        println(child.firsName)
    }

    var p3 = Person() //использование конструктора без аргументов, можно потом инициировать

    p3.firsName = "Иван"
    p3.lastName = "Иванов"
    p3.children.add(ch3)

    println("Имя:${p3.firsName}\nФамилия:${p3.lastName}\nВозраст:${p3.age}\nДети:")
    for (child in p3.children){
        println(child.firsName)
    }

    var r = Rectangle (1.7, 5.8)
    println(r.perimetr)
    r.test = -7 // примеры использования геттеров и сеттеров в котлин
    r.test = 7
     println(r.test)
    r.test = 0
    println(r.test)
    r.test = -1
}

class Person (var firsName: String, var lastName: String, var age: Int) // первичный конструктор
{
    var children: MutableList <Person> = mutableListOf() //ArrayList как в java изменяемый список // mutableListOf() пустой список

init { // добавление кода при создании объекта init блок
    println("Создана персона $firsName") //
}

constructor(firsName: String, lastName: String, age: Int, child: Person):this(firsName, lastName, age)  //вторичный конструктор, все остальные конструкторы которые требуются для создания этого объекта (всегда должен в себе вызывать первичный конструктор)(можно передавать другие аргументы, похоже на перегрузку конструкторов в java)
{
children.add(child) //добавляем ребенка в конструктор
}

//конструктор бех аргументов
    constructor(): this("", "", -1)


}
class Rectangle (var heinght: Double, var lenght: Double){
    var perimetr = (heinght + lenght) * 2

     var  test = 1
        get() = field + 1 // это геттер в котлин, field аналогично this в java ( в данном случае field обращается к полю test)
        set(value) {   //это сеттер в котлин, тут field опять обращается в test, но уже с обновленным значением условия сеттера
            field = value
            if (value < 0)  {println("Негативное значение")
            }
else {field = value }

        }

}

