class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void InsertAtBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void InsertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data) return true;
            temp=temp.next;
        }
        return false;
    }
}
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.InsertAtBegining(30);
        list.InsertAtBegining(20);
        list.InsertAtBegining(10);
        list.InsertAtEnd(40);
        System.out.println(list.search(30));
        System.out.println(list.search(99));
        
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
