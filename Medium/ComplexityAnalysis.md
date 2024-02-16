## **For this solution we consider:**

**In time complexity ⏲:**

- The function `reverseOddLevels` starts with a constant-time check for the root, O(1).
- The `reverseOddLevelsHelper` function is called recursively. At each level, it swaps the values of nodes if the level is odd, traversing all nodes in the tree. Thus, its time complexity is O(n), where n is the number of nodes in the tree.
- Since the time complexity of `reverseOddLevelsHelper` dominates, the overall time complexity for a perfect binary tree is O(n), where n = 2^h - 1, with h being the height of the tree.

**In space complexity 🖥:**

- The space complexity is determined by the maximum depth of the recursion stack, which depends on the height of the binary tree. In a perfect binary tree, the recursion stack may reach a depth of n (number of nodes in the tree), leading to a space complexity of O(n).
- Additionally, the solution uses only a constant amount of extra space for variables such as `level`, `node1`, `node2`, and `tmp`. Therefore, the overall space complexity remains O(n).
