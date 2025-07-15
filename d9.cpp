//inorder of any binary search tree-bst -always in sorted order
//k th largest element=n-k smallest element
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    bool isBST(TreeNode* root,int low,int range){
        if (root==NULL)return true;
    }
public:
    bool isValidBST(TreeNode* root) {
        return isBST(root,INT_MIN,INT_MAX);
        
    }
};