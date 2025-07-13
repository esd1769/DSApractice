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
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        map<int,int>inMap;
        for (int i=0;i<inorder.size();i++){
            inMap[inorder[i]]=i;
        }
        TreeNode* root=buildTree(preorder,0,preorder.size()-1,inorder,0,inorder.size()-1,inMap);
        return root;
        
    }
    //if map not pass by ref..i will give tlc as creating new map everytime
    //TreeNode* buildTree(vector<int>& preorder,int pstart,int pend, vector<int>& inorder,int istart,int iend,map<int,int> inMap){
    TreeNode* buildTree(vector<int>& preorder,int pstart,int pend, vector<int>& inorder,int istart,int iend,map<int,int>& inMap){
        //if(pstart>pend)||(istart>iend)) return NULL; error
        if((pstart>pend)||(istart>iend)) return NULL;
        TreeNode* root=new TreeNode(preorder[pstart]);
        int inroot=inMap[preorder[pstart]];
        int leftpart=inroot-istart;



        root->left=buildTree(preorder,pstart+1,pstart+leftpart, inorder,istart,istart+leftpart-1,inMap);
        //root->right=buildTree(preorder,pstart+leftpart+1,pend, inorder,istart+leftpart+1,iend,inMap);
        root->right=buildTree(preorder,pstart+leftpart+1,pend, inorder,inroot+1,iend,inMap);
        return root;


    }
};