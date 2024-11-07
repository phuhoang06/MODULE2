package Mang;

import java.util.Scanner;

public class add_value_array {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array : ");
            size = sc.nextInt();
            arr = new int[size];
            if (size > 20) {
                System.out.println("Nhap so luong nho hon");
            }
        } while (size > 20);
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
    }
}
