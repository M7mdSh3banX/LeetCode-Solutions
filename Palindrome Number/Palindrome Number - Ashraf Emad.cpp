// Author : Ashraf Emad Alagmawy
// Time Complexity : O (n) , Space Complexity : O (1)

class Solution {
public:
    bool isPalindrome(int x) {
        long long copyedNumber = x;
        long long palindromeNumber = 0, remainder;
        while (x > 0) {
            remainder = x % 10;
            palindromeNumber = (palindromeNumber * 10) + remainder;
            x /= 10;
        }
        if (copyedNumber == palindromeNumber) 
            return true;
        else
            return false;
    }
};