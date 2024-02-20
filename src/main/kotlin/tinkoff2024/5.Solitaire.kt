package tinkoff2024

/*
Дедовский способ

Поговаривают, что олдскульные программисты до сих пор развлекаются с помощью стандартных игр наподобие сапера и пасьянса.

Общий смысл игры в пасьянс довольно прост - необходимо разложить карты в стопки по определенным правилам (например, по масти, по старшинству и т.п.).

Рассмотрим упрощенную версию игры, в которой участвуют N стопок карт, причем каждая карта имеет номинал от 1 до N. Целью нашей версии пасьянса будет разложить карты по стопкам так, чтобы карты с номиналом 1 находились в первой стопке, с номиналом 2 - во второй и так далее. При этом разрешается брать карту только с вершины колоды и класть только на вершину любой другой колоды.

Выпишите последовательность действий, которая позволит победить в игре.

Формат входных данных
В первой строке входных данных записано одно натуральное число N, не превосходящее 500. В следующих N строках описаны колоды карт: сначала записано число k -- количество карт в колоде, а затем ﻿
k чисел -- номиналы карт в данной колоде, снизу вверх. В каждой колоде вначале не более 500 карт (в процессе игры это ограничение может быть нарушено).

Формат выходных данных
Программа должна вывести описание действий: для каждого действия напечатать два числа -- из какой колоды брать карту и в какую колоду класть. Если расстановка не имеет решения, необходимо вывести одно число 0.

Если решений несколько, выведите любое из них.



Примеры данных
3
4 1 2 3 2
0
0
3
4 1 2 3 2
0
0
1 2
1 3
1 2
1 2
2 1
2 3
2 3
3 2
3 2

 */
import java.util.*

data class Move(val from: Int, val to: Int)

fun main() {
    val n = readln().toInt()
    val decks = Array(n) { Stack<Int>() }
    for (i in 0 until n) {
        val input = readln().split(" ").map { it.toInt() }.drop(1)
        input.reversed().forEach { decks[i].push(it) }
    }

    val moves = mutableListOf<Move>()
    val visited = HashSet<String>()
    val queue: Queue<Pair<Array<Stack<Int>>, MutableList<Move>>> = LinkedList()

    queue.add(Pair(decks, mutableListOf()))

    while (queue.isNotEmpty()) {
        val (currentDecks, currentMoves) = queue.poll()
        if (isCompleted(currentDecks)) {
            moves.addAll(currentMoves)
            break
        }

        val hash = hashDecks(currentDecks)
        if (hash in visited) continue
        visited.add(hash)

        for (i in currentDecks.indices) {
            if (currentDecks[i].isEmpty()) continue
            for (j in currentDecks.indices) {
                if (i == j || currentDecks[i].peek() != j + 1 && currentDecks[j].size == n) continue
                val newDecks = currentDecks.map { Stack<Int>().apply { addAll(it) } }.toTypedArray()
                val newMoves = currentMoves.toMutableList()
                newMoves.add(Move(i + 1, j + 1))
                newDecks[j].push(newDecks[i].pop())

                queue.add(Pair(newDecks, newMoves))
            }
        }
    }

    if (moves.isEmpty()) {
        println(0)
    } else {
        moves.forEach { println("${it.from} ${it.to}") }
    }
}

fun isCompleted(decks: Array<Stack<Int>>): Boolean = decks.withIndex().all { (index, stack) ->
    stack.size == decks.size && stack.all { it == index + 1 }
}

fun hashDecks(decks: Array<Stack<Int>>): String = decks.joinToString(separator = "|") { deck ->
    deck.joinToString(separator = ",", prefix = "[", postfix = "]")
}
