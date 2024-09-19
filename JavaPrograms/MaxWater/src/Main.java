import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxArea = 0;
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int currentArea = Math.min(arr[left], arr[right]) * (right - left);
            if(currentArea > maxArea)
                maxArea = currentArea;
            if(arr[left] < arr[right])
                left ++;
            else
                right --;
        }
        System.out.println(maxArea);
        sc.close();
    }
}