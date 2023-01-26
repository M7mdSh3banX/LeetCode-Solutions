//Author: Mohamed Shaban Ahmed
//Time Complexity: O(n)
//Space Complexity: O(1)
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        //check value of root
        if (root == null)
            return root
        
        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        
        return root        
    }
}
