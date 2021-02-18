package Assignment3;

public class PalindromeLinkedList {
    
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

    boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null) {
            if(slow.value != fast.value) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;

    }
    public Node reverse(Node node) {
        Node prev = null;
        while (node != null) {
            Node next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    } 
    
    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
        

        System.out.println(list.isPalindrome(head)); 
    }
}
