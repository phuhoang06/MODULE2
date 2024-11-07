package Mang;

import java.util.Scanner;

public class add_up_NewArray {
    public static void main(String[] args) {
        int size;
        int[] arr1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array1 : ");
            size = sc.nextInt();
            arr1 = new int[size];
            if (size > 20) {
                System.out.println("Nhap so luong nho hon");
            }
        } while (size > 20);
        int i = 0;
        while (i < arr1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            i++;
        }
        int[] arr2;
        do {
            System.out.println("Enter the size of the array2 : ");
            size = sc.nextInt();
            arr2 = new int[size];
            if (size > 20) {
                System.out.println("Nhap so luong nho hon");
            }
        } while (size > 20);
        int s = 0;
        while (s < arr2.length) {
            System.out.print("Enter element " + (s + 1) + ": ");
            arr2[s] = sc.nextInt();
            s++;
        }
        int[] arr3;
        arr3 = new int[arr2.length + arr1.length];
        for (int e = 0; e < arr1.length; e++) {
                arr3[e] = arr1[e];
        }
        for (int e = 0; e < arr2.length; e++) {
            arr3[arr1.length + e] = arr2[e];
        }

        for (int j = 0; j < arr3.length; j++) {
            System.out.println("arr new :" + arr3[j]);
        }

    }}