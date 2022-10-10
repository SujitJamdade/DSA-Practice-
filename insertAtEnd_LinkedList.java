public class insertAtEnd_LinkedList {

    public static void main(String args[]){

        LinkedList l1 = new LinkedList(); // creats a new LL
        l1.insertAtEnd(1);
        l1.insertAtEnd(5);
        l1.insertAtEnd(9);
        l1.print();
    }
}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        // this.next will by default have the value 'null'
    }
}

class LinkedList{
    Node head;  // reference variable, to refer to the first Node
    void insertAtEnd(int val){

        //1. create a node with the value 'val', whose next = null
        Node n = new Node(val);

        // 2. check if the Linked List is empty (this.head == null )
        if(this.head == null){
            this.head=n;
            return;
        }

        // 3. make temp refer to the last node of LinkedList
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }

        // 4. Now insert new Node 'n' next to the Node referred by temp
        temp.next = n;
    }

    void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }


}