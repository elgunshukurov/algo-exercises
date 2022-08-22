package eOlymp.competitions;

import java.util.Scanner;

public class ServerProblem {
    public static void main(String[] args) {

        System.out.println(true && true);

    }

    public static int server(int count, int time) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
        }

        int total = 0;
        int res = 0;

        while (total<=time) {
            total += arr[res++];
        }

        return  res-1;
    }
}
