//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    fun canBeIncreasing(nums: IntArray): Boolean {
        var counter = 0
        for (i in 1 until nums.size) {
            if (nums[i] <= nums[i - 1])
                counter++
            if (i > 1 && nums[i - 2] >= nums[i])
                nums[i] = nums[i - 1]
            if (counter > 1)
                return false
        }
    return true
    }
}
