package week1;

import java.util.*;

public class  Ex7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        int sum = 0;

        for (int i = n - k; i < n; i++) {
            sum += arr[i];
        }

        int forecast = sum / k;

        System.out.println("Forecasted value: " + forecast);
    }
}
