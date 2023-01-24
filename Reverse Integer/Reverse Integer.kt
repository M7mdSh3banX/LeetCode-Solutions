//Author: Mohamed Shaban Ahmed
//Time Complexity: O(logn)
//Space Complexity: O(1)
class Solution {
    fun reverse(x: Int): Int {
        var reminder: Int
        var reversedNumber = 0
        var value = x

        while (value != 0) {

            reminder = value % 10
            value /= 10

            //reminder > 7 and reminder < -8 because biggest int 32 bit is 2147483647 and least is -2147483648
            if (reversedNumber > Int.MAX_VALUE / 10 || (reversedNumber == Int.MAX_VALUE / 10 && reminder > 7))
                return 0
            if (reversedNumber < Int.MIN_VALUE / 10 || (reversedNumber == Int.MIN_VALUE / 10 && reminder < -8))
                return 0

            reversedNumber = (reversedNumber * 10) + reminder
        }

        return reversedNumber
    }
}
