package com.yagmurerdogan.varargparameter
/*
Bir fonksiyonda çok fazla parametre varsa vararg kullanılabilir.
Fonksiyon tek bir parametre alıyormuş gibi görünür ancak çok sayıda parametre alabilir.
Bunlara array'e erişir gibi erişebiliriz.
 */

fun main() {
    val array: IntArray = intArrayOf(1,2,3,4,5,6)
    println(getSum(1, 20, *array, 62)) // Output is -> 104
}

fun getSum(a: Int, vararg numbers: Int): Int {
    var sum = a
    for (number in numbers) sum += number
    return sum
}


