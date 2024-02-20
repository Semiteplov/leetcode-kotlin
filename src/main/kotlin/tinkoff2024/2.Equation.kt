package tinkoff2024

import kotlin.math.sqrt

/*
Реализуйте алгоритм решения квадратного уравнения Ax^2+Bx+C=0.

Формат входных данных
На вход подаются целочисленные коэффициенты A, B и C в одну строку через пробел. Гарантируется, что хотя бы один из коэффициентов не равен нулю.

Формат выходных данных
Выведите корни квадратного уравнения. Если корня два, выводите их в порядке возрастания. Если корень один, то нужно вывести только его. Если корней нет, выводить ничего не нужно.

Примеры данных
1 -5 6
1 -5 6

 */
fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    if (a == 0 && b == 0) return

    val roots = getRootsOfEquation(a, b, c)
    val result = roots?.sorted()?.joinToString(" ") ?: return
    println(result)
}

fun getRootsOfEquation(a: Int, b: Int, c: Int): DoubleArray? {
    val discriminant = b * b - 4 * a * c
    if (discriminant < 0) return null
    if (a == 0) return doubleArrayOf(-c.toDouble() / b)

    val sqrdDisc = sqrt(discriminant.toDouble())
    val firstRoot = (-b + sqrdDisc) / (2 * a)
    val secondRoot = (-b - sqrdDisc) / (2 * a)

    return if (firstRoot == secondRoot) doubleArrayOf(firstRoot) else doubleArrayOf(
        firstRoot,
        secondRoot
    )
}