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
class LinkedList
{
    Node head;
    public void addNode(int val)
    {
        Node newNode = new Node(val);
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
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        list1.addNode(3); list1.addNode(4); list1.addNode(532);
        list1.display();

        LinkedList list2 = new LinkedList();
        list2.addNode(1); list2.addNode(6); list2.addNode(511);
        list2.display();

        LinkedList list3 = new LinkedList();
        Node temp1 = list1.head; Node temp2 = list2.head;

        while(temp1 != null && temp2 != null)
        {
            if(temp1.data < temp2.data)
            {
                list3.addNode(temp1.data);
                temp1 = temp1.next;
            }
            else
            {
                list3.addNode(temp2.data);
                temp2 = temp2.next;
            }
        }
        Node temp3 = list3.head;
        while(temp3.next != null)
        {
            temp3 = temp3.next;
        }

        if(temp1 == null)
        {
            temp3.next = temp2;
        }
        else
        {
            temp3.next = temp1;
        }
        System.out.println("The merged linked list is: ");
        list3.display();
    }
}