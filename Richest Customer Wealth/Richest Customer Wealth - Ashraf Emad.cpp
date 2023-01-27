// Author : Ashraf Emad Alagmawy
// Time Complexity : O(n^m) , Space Complexity O(1)

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int sum = 0, maxSum = 0; 
        for(int i = 0;i < accounts.size(); i++) { 
            sum = 0;
            for(int j = 0; j < accounts[0].size(); j++) {
                sum += accounts[i][j];
            }
            maxSum = max(sum, maxSum);
        }
        return maxSum;
    }
};