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
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        while(true)
        {
            System.out.println("Enter the node value");
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            sc.nextLine(); // To prevent from reading the leftover newline from the nextInt() function
            linkedList.addNode(val);
            System.out.println("Do you want to add more(y/n))");
            String choice = sc.nextLine().trim();
            if(choice.equals("n"))
            {
                break;
            }
        }
        linkedList.display();
    }
}