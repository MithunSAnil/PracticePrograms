import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder str3 = new StringBuilder();
        int alternate = 1;
        int n = str1.length();
        for(int i = 0; i < n; i++)
        {
            if(str1.charAt(i) == str2.charAt(i))
            {
                if(str1.charAt(i) == 'B')
                {
                    str3.append('W');
                }
                else
                {
                    str3.append('B');
                }
            }
            else
            {
                if(alternate == 1)
                    str3.append(str1.charAt(i));
                else
                    str3.append(str2.charAt(i));
                alternate = alternate * -1;
            }
        }
        System.out.println(str3);
    }
}