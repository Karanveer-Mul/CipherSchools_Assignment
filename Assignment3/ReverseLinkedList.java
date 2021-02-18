package Assignment3;

public class ReverseLinkedList {
    
    static Node head;
 
    static class Node {
 
        int value;
        Node next;
 
        Node(int val)
        {
            value = val;
            next = null;
        }
    }

    Node reverseList(Node root) {
        Node cur = root;
        Node prev = null;
        Node next;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    Node recursive(Node root) {
        if(root == null || root.next == null) {
            return root;
        }
        Node next= recursive(root.next);
        root.next.next = root;

        root.next = null;
        return next;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        head = list.recursive(head); 
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        } 
    }
}
