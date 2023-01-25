//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var temp = ""
        var length = str.length - 1

        while (length >= 0) {

            temp += str[length]
            length--
        }

        println("String 1: $str")
        println("String 2: $temp")

        return str == temp
    }
}
