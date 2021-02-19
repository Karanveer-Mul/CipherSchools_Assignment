package Assignment3;

public class DetectRemoveLoop {
    

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

    static Node removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            if(slow.value == fast.value) {
                fast.next.next = null;
                break;
            }
        }

        return head;
    }
    

    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println("");
    } 
    public static void main(String[] args) {
        DetectRemoveLoop list = new DetectRemoveLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        
        head.next.next.next.next.next = head.next.next;

        Node node = removeLoop(head);
        printList(node);
       
    }
}
