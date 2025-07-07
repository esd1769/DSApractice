//space O(n)-for squee binary tree...which has very very less chances
/**
//space O(n)-for squee binary tree...which has very very less chances


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
public:
    vector<int> rightSideView(TreeNode* root) {
        vector<int>ans;
        //ans.push_back(root->val);
        reversePreOrder(root,0,ans);
        return ans;

        
    }
    void reversePreOrder(TreeNode* root,int level,vector<int>ans){
        if (root==NULL)return;
        //if (root->val==ans.size())ans.push_back(root->val);
        if (level==ans.size())ans.push_back(root->val);
        reversePreOrder(root->right,level+1,ans);
        reversePreOrder(root->left,level+1,ans);

    }
};