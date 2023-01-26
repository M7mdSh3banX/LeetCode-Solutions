//Author: Mohamed Shaban Ahmed
//Time Complexity: O(logn)
//Space Complexity: O(1)
class Solution {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var counter = 0

        while (number != 0) {
            if (number % 2 == 0 )
                number /= 2
            else
                number -= 1
            counter++
        }
        return counter
    }
}
