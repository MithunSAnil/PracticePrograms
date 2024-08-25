import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String str1 = sc.nextLine();
        int longest = 1;
        int current=0;
        int i;
        for(i=0; i<str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if(!set.contains(ch))
            {
                set.add(ch);
                current = current + 1;
                if(current > longest)
                {
                    longest = current;
                }
            }
            else
            {
                i--;
                current = 0;
                set.clear();
            }
        }
        System.out.println(longest);
        sc.close();
    }

}
