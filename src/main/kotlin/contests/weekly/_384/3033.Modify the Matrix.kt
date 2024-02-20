package contests.weekly._384

class Solution3033 {
    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val m = matrix.size
        val n = matrix[0].size

        val maxInColumns = IntArray(n) { Int.MIN_VALUE }
        for (j in 0..<n) {
            for (i in 0..<m) {
                maxInColumns[j] = maxOf(maxInColumns[j], matrix[i][j])
            }
        }

        for (i in 0..<m) {
            for (j in 0..<n) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxInColumns[j]
                }
            }
        }

        return matrix
    }
}