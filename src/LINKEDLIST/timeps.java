package LINKEDLIST;

public class timeps     public void insertLast(int val){
    DLL.Node node = new DLL.Node(val);
    DLL.Node last = head;
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
{
}
