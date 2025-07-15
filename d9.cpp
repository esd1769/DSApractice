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
    bool isBST(TreeNode* root,long long low,long long high){
        //[2147483647]ilow,high long long
         if (root==NULL)return true;
         //for[2,2,2]-not bst
        //if (root->left!=NULL&&root->val==root->left->val) return false;
        //if (root->right!=NULL&&root->val==root->right->val)return false;
        //orrrrrrrrrrrrrrrrrrrrrrr
        if(!(root->val>low&&root->val<high))return false;
      //if(!(root->val>=low&&root->val<=high))return false;-error
        
        return isBST(root->left,low,root->val)&& isBST(root->right,root->val,high);
    }
public:
    bool isValidBST(TreeNode* root) {
        return isBST(root, LLONG_MIN, LLONG_MAX);
        
    }
};