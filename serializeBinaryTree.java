import java.util.*;
public class serializeBinaryTree{
    
     static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) 
        { val = x; }
     } 

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int maxLevel=Integer.MAX_VALUE;
        String ans="";
        q.add(root);
        while(!q.isEmpty()){
            
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
    }

    public static void main(String args[]){
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right=new TreeNode(3);
        tree.right.left=new TreeNode(4);
        tree.right.right=new TreeNode(5);
        System.out.println(serialize(tree));
    }
}