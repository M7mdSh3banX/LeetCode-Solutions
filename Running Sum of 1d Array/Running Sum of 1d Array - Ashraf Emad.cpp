// Author : Ashraf Emad Alagmawy
// Time Complexity : O(n) , Space Complexity O(1)

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for(int i = 1; i < nums.size(); i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
};