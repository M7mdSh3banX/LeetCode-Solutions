//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n*m)
//Space Complexity: O(1)
import kotlin.math.max
class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val rows = accounts.size        //Number of rows
        val columns = accounts[0].size  //Number of columns
        var richestCustomerWealth = 0   //Maximum wealth

        for (i in 0 until rows) {
            var temp = 0                 //Temporary variable
            for (j in 0 until columns) {
                temp += accounts[i][j]
            }
            richestCustomerWealth = max(richestCustomerWealth, temp)
        }
        return richestCustomerWealth
    }
}
