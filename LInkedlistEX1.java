class LinkedListEX1{
    Node head; // Points to the first element of the list

    // Internal Node class
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // The deleteAtBeginning method
    public void deleteAtBeginning() {
        // Step 1: Check if the list is already empty
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        // Step 2: Move the head pointer to the next node
        System.out.println("Deleting node with data: " + head.data);
        head = head.next; 
    }
}