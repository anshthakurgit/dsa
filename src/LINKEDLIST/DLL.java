package LINKEDLIST;

public class DLL {

    private Node head;
    private Node tail ;
    int size;

    private class Node{
        int val ;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node (int vl , Node next , Node prev){
            this.val=vl;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insertFirst(int val) {
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;

        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last != null){
            last=last.next;
        }

    }

    public void display(){
        Node node=head;
        Node last=null;
        while (node!=null){
            System.out.print(node.val + " <-> ");
            last=node;
            node=node.next;
        }
        System.out.print("END");
        System.out.println();
        //PRINTING REVERSE

        System.out.println("print REV");
        while (last!=null){
            System.out.print(last.val + " <-> " );
            last=last.prev;
        }
        System.out.print("START");
        System.out.println();
    }




    static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);

        list.display();
    }


}
