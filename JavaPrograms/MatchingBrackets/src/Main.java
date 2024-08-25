import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1;
        str1 = sc.nextLine();
        Stack<Character> stk = new Stack<>();

        for(char ch : str1.toCharArray())
        {
            if(ch == '{' || ch == '(' || ch == '[')
            {
                stk.push(ch);
            }
            else
            {
                if((ch == '}' && (stk.isEmpty() || stk.pop() !='{')) ||
                        (ch == ')' && (stk.isEmpty() || stk.pop() !='(')) ||
                        (ch == ']' && (stk.isEmpty() || stk.pop() !='['))
                )
                {
                    System.out.println(0);
                    return;
                }
            }
        }
        if(stk.isEmpty())
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
        sc.close();
    }
}
