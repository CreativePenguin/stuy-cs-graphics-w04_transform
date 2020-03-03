import kotlin.math.cos
import kotlin.math.sin

class Matrix(rows: Int = 4, cols: Int = 4) {

    val matrix: Array<Array<Int>>

    init {
        matrix = Array<Array<Int>>(rows) {i-> Array<Int>(cols) {j -> 0}}
    }


    fun makeTranslate(x: Int, y: Int, z: Int) {
        for(i in 0..cols) {
            matrix[0][i] = matrix[0][i] + x
            matrix[1][i] = matrix[1][i] + y
            matrix[2][i] = matrix[2][i] + z
        }
    }

    fun makeScale(x: Int, y: Int, z: Int) {
        for(i in 0..cols) {
            matrix[0][i] = matrix[0][i] * x
            matrix[1][i] = matrix[1][i] * y
            matrix[2][i] = matrix[2][i] * z
        }
    }

    fun makeRotX(theta: Int) {
        for(i in 0..cols) {
            matrix[1][i] = matrix[1][i]
        }
    }

}
