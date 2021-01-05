import typing

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def robbing(self, curr: TreeNode) -> typing.List[int]:
        if not curr:
            return [0,0]
        
        left = self.robbing(curr.left)
        right = self.robbing(curr.right)
        
        rob = left[0] + right[0] + curr.val
        skip = max(left[0], left[1]) +  max(right[0], right[1])
        
        return [skip, rob]
    
    def rob(self, root: TreeNode) -> int:
        return max(self.robbing(root))

