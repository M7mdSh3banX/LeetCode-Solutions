//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val newArray:IntArray = nums
        var iterator = 1

        while (iterator < nums.size) {
            newArray[iterator] = nums[iterator] + newArray[iterator - 1]
            iterator++
        }
        return newArray
    }
}
