import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N,X,low,mid,high,flag,i;

        flag = 0;
        N = sc.nextInt();
        X = sc.nextInt();
        int[] arr = new int[N];

        for(i = 0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }

        low = 0; high = N-1;
        while(high>=low)
        {
            mid = (low+high)/2;
            if(arr[mid] == X)
            {
                System.out.print(mid);
                flag = 1;
                break;
            }
            else if(arr[mid] > X)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        if(flag == 0)
        {
            System.out.print(-1);
        }
        sc.close();
    }
}
