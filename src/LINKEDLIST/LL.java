package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertfirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertlast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertfirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {

        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size) {
            insertlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

        size++;

    }

    public void delete(int index){
        if(index == 0){
            if (head==null){
                System.out.println("no element");
                return;
            }

            head=head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        if (index == size-1){
            if (tail==null){
                System.out.println("no element");
                return;
            }
            Node temp = head;
            while(temp.next !=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            size--;
            return;
        }
        Node temp =head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node temp2 = temp.next;
        temp.next=temp2.next;
        size--;

    }


    static void main(String[] args) {

        LL list = new LL();
        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);

        list.insertlast(5);

        list.insert(7, 3);

        list.display();
        System.out.println();
        list.delete(0);
        list.display();
        System.out.println();
        list.delete(list.size -1);
        list.display();
        System.out.println();
        list.delete(3);
        list.display();
    }


}
