package ru.otus.homework

import kotlin.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    // определеим массив целых чисел для возвращения результата согласно заданию, размерностью 2
    val intArray = IntArray(2)
    var sumOfValues = 0

    /* организуем логику следующим образом:
    * если не конец цикла, возьмём первое значение масива и сложим со вторым, потом с третьим и т.д. до конца массива.
    * переходим к следующему значению, складывать с предыдущим смысла нет, т.к. данная операция уже была,
    * складываем сразу со значением по индексу i+1, и т.д.
    * когда дошли до конца, и не получили результат, выходим по исключению
    * */
    loop1@ for (i in 0 .. numbers.size) {
        for (j in i + 1 .. numbers.size - 1) {
            sumOfValues = numbers[i] + numbers[j]
            if (sumOfValues != target) continue
            intArray[0] = i
            intArray[1] = j
            break@loop1
        }
    }

    return if (sumOfValues != target) throw IllegalArgumentException("The array of numbers does not have any values whose sum equals the target value.") else intArray
}