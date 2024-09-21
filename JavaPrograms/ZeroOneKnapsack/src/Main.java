import java.util.Arrays;
import java.util.Scanner;

class item {
    int weight, value;
    double ratio;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxWeight = sc.nextInt();
        int currentWeight = 0;
        int value = 0;
        item[] arr = new item[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new item();
            arr[i].weight = sc.nextInt();
            arr[i].value = sc.nextInt();
            arr[i].ratio = (double)arr[i].value/arr[i].weight;
        }
        Arrays.sort(arr, (a, b) -> Double.compare(b.ratio, a.ratio));
        for(item element : arr) {
            if(currentWeight + element.weight <= maxWeight) {
                currentWeight = currentWeight + element.weight;
                value = value + element.value;
            }
        }
        System.out.println(value);
    }
}