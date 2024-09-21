import java.util.Scanner;

class activity{
    String name;
    int startTime, endTime;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        activity[] arr = new activity[n];
        for(int i = 0; i<n; i++){
            sc.nextLine();
            arr[i].name = sc.nextLine();
            arr[i].startTime = sc.nextInt();
            arr[i].endTime = sc.nextInt();
        }
    }
}