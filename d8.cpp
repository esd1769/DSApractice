//Morris Traversal | Preorder | Inorder mortized O(N) time  because each edge is visited at most twice: once to create the thread, once to remove it...1,2,3,....n
//Morris Traversal-tc-O(N),sc-O(1)
//recursion Traversal-tc-O(N),sc-O(N)..recursive stack space-N
//iterative(using stack) Traversal-tc-O(N),sc-O(N),stack or queue-N
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
public:
    void flatten(TreeNode* root) {
        TreeNode* cur=root;
        while(cur){
            if(cur->left!=NULL){
            //if(cur!=NULL){
            TreeNode* prev=cur->left;
            //TreeNode* prev1=cur->left;
            while(prev->right){
                prev=prev->right;
            }
            prev->right=cur->right;
            cur->right=cur->left;
            cur->left=NULL;
            //cur->right=prev;
            }
            cur=cur->right;
            //cur=prev1;


            

        }


        
    }
};