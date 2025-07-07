/**
0000000map,set,multiset -sorted


1111111multiset
nodes[x][y].insert(nobe->val); 
column.insert(column.end(),q,send.begin(),q.second.end());



The main difference is that a set only stores unique elements—if you try to insert a duplicate, it will be ignored. On the other hand, a multiset allows duplicate elements, so multiple copies of the same value can exist. Both automatically keep elements sorted, and support functions like insert, find, erase, and count. In a set, count(x) returns either 0 or 1, while in a multiset, it returns how many times x appears. Use set when you need unique, sorted values, and multiset when duplicates are allowed but you still want them sorted
 * Definition for a binary tree node.


 222queue-push(2),vector-push_back(2)......
 queue<pair<TreeNode,pair<int,int>>>todo;
     todo.push({root,{0,0}});todo.push(root,{0,0});
     auto p=todo.front();
            todo.pop();


3333333 pair-{}
TreeNode* node=p.first;
            int x=p.second.first;
            int y=p.second.second;

44444444444vector to set(multiset)-sorted
column.insert(column.end(),q,send.begin(),q.second.end());
 

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
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int,map<int,multiset<int>>>nodes;
        queue<pair<TreeNode*,pair<int,int>>>todo;
        todo.push({root,{0,0}});
        while(!todo.empty()){
            auto p=todo.front();
            todo.pop();
            TreeNode* node=p.first;
            int x=p.second.first;
            int y=p.second.second;
            nodes[x][y].insert(node->val);
        if(node->left)todo.push({node->left,{x-1,y+1}});
        if(node->right)todo.push({node->right,{x+1,y+1}});
        }

        vector<vector<int>>ans;
        
        for (auto p:nodes){
            vector<int>column;
            for (auto q:p.second){
                column.insert(column.end(),q.second.begin(),q.second.end());
            }
            ans.push_back(column);

        }
        return ans;



        
    }
};