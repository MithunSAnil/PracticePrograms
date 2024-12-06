import java.util.Scanner;
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

    public void deleteNode()
    {
        if(head.next == null)
        {
            head = null;
        }
        else
        {
            Node temp = head;
            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }

    }

    public void reverse()
    {
        Node curr = head.next;
        Node prev = head;
        Node temp = curr;
        while(curr != null)
        {
            curr = curr.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        head.next = null;
        head = prev;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        while(true)
        {
            System.out.println("Menu:\n1:Add Node\n2:Delete Node\n3:Reverse\n4:Display\n5:Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the node value");
                    int val = sc.nextInt();
                    linkedList.addNode(val);
                    break;
                case 2:
                    linkedList.deleteNode();
                    break;
                case 3:
                    linkedList.reverse();
                    break;
                case 4:
                    linkedList.display();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
            }
        }

    }
}