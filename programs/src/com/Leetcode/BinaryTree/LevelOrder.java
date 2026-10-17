// PS: Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
// Input : root = [3, 9, 20, null, null, 15, 7]

// Output : [ [3] , [9, 20] , [15, 7] ]
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        while(!queue.isEmpty()){
            int siz = queue.size();
            List<Integer> ndList = new ArrayList<>();
            while(siz-- > 0){

                TreeNode nd = queue.remove();
                            ndList.add(nd.data);
                                        if(nd.left != null){
                queue.add(nd.left);
            }
            if(nd.right != null){
                queue.add(nd.right);
            }
            }
           
            ans.add(ndList);
            


            
        }
        return ans;
        
    }
    public List<List<Integer>> levelOrderDepthWise(TreeNode root){
        List<List<Integer>> ans = new ArrayList();
        int level = 0;

        collectByDepth(root, level, ans);
        return ans;
    }
    private void collectByDepth(TreeNode node, int level, List<List<Integer>> result){
        if(node == null) return;

        if(level == result.size()){
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.data);
        collectByDepth(node.left, level+1, result);
        collectByDepth(node.right, level+1, result);

    }
}

// Tc: O(N)
// SC: O(N)
