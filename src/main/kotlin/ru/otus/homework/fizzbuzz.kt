package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    // создаём массив Integers, размером n
    var i = 0
    val arrOfIntegers = Array(n) { i++ }

    // создаём массив Strings, размером n
    val arrOfStrings = Array(n) {""} //emptyArray<String>()   //

    // итерация по массиву arrOfIntegers, наполняем массив согласно заданию
    for ((i, v) in arrOfIntegers.withIndex()) {
        val value: String = if (i == 0 || (i % 3 == 0 && i % 5 == 0)) {
            "FizzBuzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else {
            v.toString()
        }

        arrOfStrings[i] = value
    }

    return arrOfStrings
}