import java.util.*;
public class addTwoNum{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // public static Node twoSum (Node root1,Node root2,int prev){
    //     if(root1==null ||root2==null)
    //     int val=root1.data+root2.data;
    //     root1.data=val%10;
    //     prev=val/10;
    //     twoSum(root.next,root2.next);
    //     return root1;
    // }

    public static Node twosum(Node root1,Node root2){
        int val=Calval(root1)+Calval(root2);
        return place(new Node(1),val);

    }
    public static int Calval(Node root){
        int val=0;
        while(root!=null){
            val=val*10+root.data;
            root=root.next;
        }
        return val;
    }
    public static Node place(Node root,int val){
        if(val==0){
            root.next=null;
            return null;
        }
         
            Node newNode=new Node(val%10);
            root.next=newNode;
            place(newNode,val/10);
        return root.next;
    }
    public static void main(String args[]){
        Node root=new Node(3);
        root.next=new Node(4);
        root.next.next=new Node(2);

        Node root2=new Node(4);
        root2.next=new Node(6);
        root2.next.next=new Node(8);
        Node node=twosum(root,root2);
        while(node!=null){
            System.out.print(node.data+" ");
            node =node.next;
        }

        
    }
}