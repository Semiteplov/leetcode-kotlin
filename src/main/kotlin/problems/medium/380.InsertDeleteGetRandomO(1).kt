package problems.medium

// https://leetcode.com/problems/insert-delete-getrandom-o1/
/**
 * A RandomizedSet class that supports insert, remove, and getRandom operations with an average time complexity of O(1).
 * This is achieved using a combination of a HashMap and an ArrayList.
 * - HashMap: Stores the value and its index in the ArrayList.
 * - ArrayList: Stores the actual values.
 */
class RandomizedSet() {
    private val valueToIndexMap = HashMap<Int, Int>()
    private val values = ArrayList<Int>()

    /**
     * Inserts a value into the set.
     * - If the value is already present, returns false.
     * - Otherwise, adds the value to the end of the list, stores its index in the map, and returns true.
     */
    fun insert(`val`: Int): Boolean {
        if (`val` in valueToIndexMap) {
            return false
        }
        values.add(`val`)
        valueToIndexMap[`val`] = values.size - 1
        return true
    }

    /**
     * Removes a value from the set.
     * - If the value is not present, returns false.
     * - Otherwise, swaps the value with the last element in the list, updates the map, removes the last element and the value from the map, and returns true.
     */
    fun remove(`val`: Int): Boolean {
        if (`val` !in valueToIndexMap) {
            return false
        }
        val index = valueToIndexMap[`val`]!!
        val lastElement = values.last()
        values[index] = lastElement
        valueToIndexMap[lastElement] = index
        values.removeAt(values.size - 1)
        valueToIndexMap.remove(`val`)
        return true
    }

    /**
     * Returns a random element from the set.
     * Generates a random index within the range of the list size and returns the element at that index.
     */
    fun getRandom(): Int {
        return values.random()
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */