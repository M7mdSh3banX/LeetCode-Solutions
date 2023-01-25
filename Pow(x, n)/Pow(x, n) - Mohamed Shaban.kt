//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    fun myPow(x: Double, n: Int): Double {
        var result = 1.0
        var iterator = n

        if ((x == 1.0 && n > 0) || (x == -1.0 && n < 0))
            return 1.0
        else if (x == -1.0)
            return -1.0
        else if (x == 1.0)
            return 1.0

        if (n > Int.MAX_VALUE / 10)
            return 0.0
        if (n < Int.MIN_VALUE / 10)
            return 0.0

        if (iterator < 0) {
            iterator *= -1

            while (iterator != 0) {
                result *= 1 / x
                iterator--
            }
        } else {
            while (iterator != 0) {
                result *= x
                iterator--
            }
        }
        return result
    }
}
