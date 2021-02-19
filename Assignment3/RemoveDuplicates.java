package Assignment3;

public class RemoveDuplicates {
    
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
    
    public void insert(int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void removeAllDuplicates() 
    { 
        
        Node dummy = new Node(0); 

        dummy.next = head; 
        Node prev = dummy; 
        Node current = head; 

        while (current != null) 
        { 
            while (current.next != null && 
                prev.next.value == current.next.value) 
                current = current.next; 
            if (prev.next == current) 
                prev = prev.next; 

            else
                prev.next = current.next; 

            current = current.next; 
        } 
        head = dummy.next; 
    } 

    void printList(Node head)
        {
            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println("");
        } 

    public static void main(String[] args) 
    { 
        RemoveDuplicates list = new RemoveDuplicates(); 
        list.insert(53); 
        list.insert(53); 
        list.insert(49); 
        list.insert(49); 
        list.insert(35); 
        list.insert(28); 
        list.insert(28); 
        list.insert(23); 

        list.removeAllDuplicates(); 

        list.printList(head); 
    }
}
