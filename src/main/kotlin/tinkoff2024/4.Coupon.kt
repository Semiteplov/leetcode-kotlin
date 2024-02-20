package tinkoff2024

/*
Маркетплейс предоставляет купон на покупку двух товаров из разных категорий на сумму S рублей.

Хочется с максимальной выгодой воспользоваться акцией. Выгодным использованием считается покупка на сумму ровно S рублей (купон используется полностью и ничего доплачивать не придется).

Вы отобрали списки нужных вам товаров из первой категории и из второй и отсортировали их по цене. Сколькими способами можно выгодно воспользоваться купоном?

Формат входных данных
В первой строке идет сумма купона S.

Во второй строке идут цены товаров первой категории в порядке возрастания через пробел.

В третьей строке - цены товаров второй категории в порядке возрастания через пробел.

Для простоты можно считать, что цены в каждой группе товаров не повторяются.

Формат выходных данных
Выведите одно число - ответ на задачу.

Примечание
В задаче запрещено использование ассоциативных коллекций (set, dict и т.п.)

Примеры данных
5
1 2 3 4
1 2 3
5
1 2 3 4
1 2 3
3

 */
fun main() {
    val s = readln().toInt()
    val firstCategory = readln().split(" ").map { it.toInt() }
    val secondCategory = readln().split(" ").map { it.toInt() }

    println(getWaysCountToBuyBothItems(s, firstCategory, secondCategory))
}

fun getWaysCountToBuyBothItems(targetSum: Int, first: List<Int>, second: List<Int>): Int {
    var ways = 0
    var firstStart = 0
    var secondEnd = second.lastIndex

    while (firstStart < first.size && secondEnd >= 0) {
        val sum = first[firstStart] + second[secondEnd]
        if (sum == targetSum) {
            ways++
            firstStart++
            secondEnd--
        } else if (sum < targetSum) {
            firstStart++
        } else {
            secondEnd--
        }
    }

    return ways
}
