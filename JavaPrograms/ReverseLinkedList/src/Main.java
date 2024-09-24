class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LList
{
    Node head;
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("Empty linked list");
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
    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node temp;
        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;

    }
}
public class Main {
    public static void main(String[] args) {
        LList list = new LList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        System.out.println("Initial linked list: ");
        list.display();
        list.reverse();
        System.out.println("Reversed linked list: ");
        list.display();
    }
}