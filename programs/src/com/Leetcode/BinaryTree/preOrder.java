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
    public List<Integer> preorder(TreeNode root) {
        //your code goes here
        List<Integer> list = new ArrayList<>();
        PreorderTraversalIterative(root, list);
        return list;
    }
    private void PreorderTraversalRecursive(TreeNode root, List<Integer> list) {
        if (root == null) return; 
        list.add(root.data);
        PreorderTraversalRecursive(root.left, list);
        PreorderTraversalRecursive(root.right, list);
    }


  private void PreorderTraversalIterative(TreeNode root, List<Integer> list){

        Stack<TreeNode> st = new Stack();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            list.add(node.data);
                if(node.right != null){
                    st.push(node.right);
                }
                if(node.left != null){
                    st.push(node.left);
                }
           
            }
        }

  
    private void PreorderTraversalIterative2(TreeNode root, List<Integer> list){

        Stack<TreeNode> st = new Stack();

        TreeNode node = root;
        while(true){
            if(node != null){
                list.add(node.data);
                st.push(node);
                node =  node.left;
            } else {
                if(st.empty()){
                    return;
                }
                TreeNode tp = st.pop();
                // list.add(tp.data);

                node = tp.right;
            }
        }
    }

}

// TC: O(N) -> every node visited exactly once
// SC: O(H) -> Height of the BT
// for skewed BT -> O(1)
