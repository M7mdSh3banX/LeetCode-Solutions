// Author : Ashraf Emad Alagmawy
// Time Complexity : O (log(n)) , Space Complexity : O (1)

class Solution {
public:
    double myPow(double x, int n) {
        if(n == 0) 
			return 1;
		// Using Binary Exponentiation(Time O(logN))
        double y = myPow(x, n / 2);
        if(n % 2 == 0)
            return y * y;
        else if(n < 0)
            return 1 / x * y * y;
        else
            return x * y * y; 
    }
};

// class Solution {
// public:
//     // Worst Solution
//     double myPow(double x, int n) {
//         return pow(x, n);
//     }
// };