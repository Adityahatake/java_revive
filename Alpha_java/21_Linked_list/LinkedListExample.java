// Node class representing each element of the linked list
class Node {
    int data;        // Data stored in the node
    Node next;       // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

// LinkedList class to handle list operations

class LinkedList {
    Node head; // Head of the list

    // Method to add a node to the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // First node
        } else {
            Node temp = head;
            while (temp.next != null) {  // Traverse to the end
                temp = temp.next;
            }
            temp.next = newNode; // Add new node at the end
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        
        list.display();
    }
}
