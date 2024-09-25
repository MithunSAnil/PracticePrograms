class Node
{
    Node prev;
    int data;
    Node next;
    Node(int data)
    {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}
class DLL
{
    Node head;
    Node tail;

    public void addNodeEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addNodeStart(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
public class Main {
    public static void main(String[] args) {
    DLL dlist = new DLL();
    dlist.addNodeEnd(5);
    dlist.addNodeEnd(6);
    dlist.addNodeEnd(7);
    dlist.addNodeStart(1);
    dlist.addNodeStart(2);
    dlist.addNodeStart(3);
    dlist.display();

    }
}