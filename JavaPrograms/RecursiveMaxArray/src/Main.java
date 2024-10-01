import java.util.Scanner;
class Arrays
{
    public int maxArray(int[] arr, int currentMax, int currentIndex)
    {
        if(currentIndex == arr.length)
        {
            return currentMax;
        }
        else if(arr[currentIndex] > currentMax)
        {
            currentMax = arr[currentIndex];
        }
        return maxArray(arr, currentMax, currentIndex + 1);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays arr = new Arrays();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the number");
            list[i] = sc.nextInt();
        }
        int maxElement = arr.maxArray(list, list[0], 0);
        System.out.println("The maximum value is: " + maxElement);
    }
}