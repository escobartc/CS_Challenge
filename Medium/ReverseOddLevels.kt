package com.example.myapplication.Medium

// Definition of a TreeNode
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun reverseOddLevels(root: TreeNode?): TreeNode? {
    // Check if the received treenode is not null
    if (root != null) {
        // Call the helper that will receive the level to validate and reverse the node values (if odd)
        reverseOddLevelsHelper(root.left, root.right, 1)
    }
    return root
}

private fun reverseOddLevelsHelper(node1: TreeNode?, node2: TreeNode?, level: Int) {
    // Validate that the current level is an odd level and the 2 child nodes received are not null
    if (level % 2 != 0 && node1 != null && node2 != null) {
        // create a variable that temporally stores the value of the node1 (left node)
        val tmp = node1.`val`
        // assign to the node1 the value of the node2 (right node)
        node1.`val` = node2.`val`
        // finally assign the previously saved value to the right node
        node2.`val` = tmp
    }
    /* If the received nodes have child nodes, we call the function helper again to do the process with
    the next level */
    if (node1 != null && node2 != null) {
        reverseOddLevelsHelper(node1.left, node2.right, level + 1)
        reverseOddLevelsHelper(node1.right, node2.left, level + 1)
    }
}