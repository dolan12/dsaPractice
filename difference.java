// Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

// A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
public class difference{
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(3);
        root.right=new Node(10);
        root.left.left=new Node(1);
        root.left.right=new Node(6);
        root.left.right.left=new Node(4);
        root.left.right.right=new Node(7);
        root.right.right=new Node(14);
        root.right.right.right=new Node(13);
        System.out.println(maxAncestorDiff(root));
        
    }
    
    public static int maxAncestorDiff(Node root) {
        int max=root.val;
        int min=root.val;
        
        return calAncestorDiff(root,max,min);
        
    }
    public static int calAncestorDiff(Node node,int max,int min){
        if(node==null)
        return 0;
        int diff=Math.max(Math.abs(max-node.val),Math.abs(min-node.val));
        max=Math.max(max,node.val);
        min=Math.min(min,node.val);
        int leftDiff = calAncestorDiff(node.left, max, min);
        int rightDiff = calAncestorDiff(node.right, max, min);
        return Math.max(diff, Math.max(leftDiff, rightDiff));
    }
}