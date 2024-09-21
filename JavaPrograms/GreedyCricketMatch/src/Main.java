import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
class Activity{
    String name;
    int startTime, endTime;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Activity[] arr = new Activity[n];
        for(int i = 0; i<n; i++) {
            arr[i] = new Activity();
            arr[i].name = sc.next();
            arr[i].startTime = sc.nextInt();
            arr[i].endTime = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a.endTime));
        int currEndTime = arr[0].endTime;
        System.out.print(arr[0].name + " ");
        for(int i = 1; i < n; i++) {
            if(currEndTime < arr[i].startTime) {
                System.out.print(arr[i].name + " ");
                currEndTime = arr[i].endTime;
            }
        }
    }
}