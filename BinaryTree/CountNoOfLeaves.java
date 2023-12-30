package BinaryTree;

// import org.w3c.dom.Node;
import java.util.*;
class Node
{
    int data ;
    Node left, right ;
}
public class CountNoOfLeaves {
    public static int countLeaves(Node root) 
    {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;

        return countLeaves(root.left) + countLeaves(root.right);
    }
    // public static void main(String[] args) {
    //   Node a = new Node();
    //   a.data = 1;


        
    // }
}
