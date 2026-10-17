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
    public List<Integer> postorder(TreeNode root) {
        List<Integer> ansList = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode node = st.pop();
            ansList.add(0,node.data);
            if(node.left != null){
                st.push(node.left);
            } 
            if(node.right != null){
                st.push(node.right);
            }
        }
        return ansList;
    }
    public void postorderRecursive(TreeNode root, List<Integer> list){
        if(root != null){
            postorderRecursive(root.left, list);
            postorderRecursive(root.right, list);
            list.add(root.data);
        }
    }
}
// TC: O(N)
// SC: O(H)
