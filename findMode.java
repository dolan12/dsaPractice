public class findMode{
    public class node{
        int val;
        Node left,right;
        node(int val){
            this.val=val;
        }
    }
    public static void main(String args[]){
        node root=new node(1);
        root.right=new node(2);
        root.right.left=new node(2);

    }
    public static int[] findmode(node root){
        int ans[]=new int[];
        Stack<Integer> s=new Stack();
        cal(root,s);

    }
    public static cal(node root,Stack s){
        if(root==null)
        return;
        cal(root.left,s);
        cal(root.right,s);
        
        
    }
}