//Uses reversing of singly linked list
import java.util.Scanner;

class node
{
    int data;
    node next;

    node(int d)
    {
        data = d;
        next = null;
    }
}

class linkedlist
{
    node head = null;

    void insertl(int d)
    {
        node nnode = new node(d);
        if (head == null)
        {
            head = nnode;
        }
        else
        {
            node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = nnode;
        }
    }

    void display()
    {
        node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverse()
    {
        if(head != null)
        {
            node prev = null;
            node current = head;
            node next;

            while(current != null)
            {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        int value;

        do
        {
            value=sc.nextInt();
            if(value>=0)
                list.insertl(value);
            else
                list.reverse();
        } while (value != 101);
        list.reverse();
        list.display();
        sc.close();
    }
}
