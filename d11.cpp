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
    int widthOfBinaryTree(TreeNode* root) {
        if (root==NULL)return 0;
        queue<pair<TreeNode* ,int>>q;
        int ans=0;
        q.push({root,0});
        while(!q.empty()){
            int size=q.size();
            int min=q.front().second;
            int first,last;
            for (int i=0;i<size;i++){
                //int curIndex=q.front().second-min;
                long long curIndex=q.front().second-min;//this part can do INT_MAX*2 or INT_MAX*2 +1 ,so better long long ,not int
                TreeNode* root=q.front().first;
                q.pop();
                if (i==0)first=curIndex;
                if (i==size-1)last=curIndex;
                if (root->left){
                    //this part can do INT_MAX*2 or INT_MAX*2 +1 ,so better long long ,not int
                    q.push({root->left,curIndex*2+1});//apply segment tree
                    //this part can do INT_MAX*2 or INT_MAX*2 +1 ,so better long long ,not int
                }
                if (root->right){
                    //this part can do INT_MAX*2 or INT_MAX*2 +1 ,so better long long ,not int
                    q.push({root->right,curIndex*2+2});//apply segment tree
                    //this part can do INT_MAX*2 or INT_MAX*2 +1 ,so better long long ,not int
                }


            }
            ans=max(ans,last-first+1);

        }
        return ans;
        
    }
};