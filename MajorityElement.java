import java.util.Stack;

class BST {
        class Node { 
            int key;
            int count; 
            Node left, right; 
       
            public Node(int data){ 
                key = data;
                count = 1; 
                left = right = null; 
            } 
        }
        Node root;
    
        BST(){ 
            root = null; 
        } 
        void insert(int key)  { 
            root = insert_Recursive(root, key); 
        } 
       
        Node insert_Recursive(Node root, int key) { 
              
            if (root == null) { 
                root = new Node(key); 
                return root; 
            } 
            //traverse the tree
            if (key < root.key)     //insert in the left subtree
                root.left = insert_Recursive(root.left, key); 
            else if (key > root.key)    //insert in the right subtree
                root.right = insert_Recursive(root.right, key); 
            else root.count += 1;
            return root; 
        } 
    }

public class MajorityElement {
    
    
    static void majorityEle(BST.Node root, int len) {
        int max = 0;
        int num = 0;
    
        Stack<BST.Node> s = new Stack<>();
        s.add(root);
        BST.Node node = root;
        while(!s.isEmpty()) {
            if(node != null) {
                if(max < node.count) {
                    max =  node.count;
                    num = node.key;
                }
                s.push(node);
                node = node.left;
            }
            else {
                node = s.pop();
                node = node.right;
            }
        }
    
    
        if(max > len) System.out.println(num);
        else System.out.println("No Majority Element");
    }
    

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4};
        
        BST bt = new BST();
        for(int x: arr2) {
            bt.insert(x);
        }
        int len = arr1.length;
        
        majorityEle(bt.root, len/2);
        
        
    }
}
