// Author : Ashraf Emad Alagmawy
// Time Complexity : O (n) , Space Complexity : O (1)

class Solution {
public:
    int reverse(int x) {
       long long sum = 0;
       bool isNegative = false;
       if(x < 0) {
           isNegative = true;
           x = abs(x);
       }
        while(x > 0) {
            sum = (sum * 10) + (x % 10);
            // Remember that 32 bit is INT_MAX = 2147483647 and least is INT_MIN = -2147483648
            if (sum > INT_MAX || sum < INT_MIN) {
                return 0;
            }
                x /= 10;
        }
        if(isNegative)
            return -sum;
        else
            return sum;
    }
};