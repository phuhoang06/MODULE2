package Mang;

import java.util.Scanner;

public class remove_value_in_array {
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
int index = -1;
        int x ;
        do {
            System.out.print("nhap phan tu can xoa : ");
            x = sc.nextInt();
            for (i = 0; i< arr.length;i++){
                if (arr[i] == x){
                    index = i;
                }
            }
            if (index == -1){
                System.out.println("Element not found");
            }
        }while (index == -1);
        int[] newArray = new int[arr.length];
        for (i = 0; i< index;i++){
            newArray[i] = arr[i];
        }
        for (i =index; i < arr.length-1;i++){
            newArray[i] = arr[i+1];
        }
//        int s;int x;
//        boolean found ;
//        do {
//            found = false;
//
//            System.out.print("nhap phan tu can xoa : ");
//            x = sc.nextInt();
//            for (s = 0; s < arr.length-1; s++) {
//                if (arr[s] == x) {
//                    found = true;
//                    break;
//
//                }
//            }
//            if (!found) {
//                System.out.println("khong co phan tu nao nhu vay trong mang");
//            }
//        }while (!found);
//
//
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] == x) {
//                for (int k = j; k < arr.length -1 ; k++) {
//                    arr[k] = arr[k + 1];
//                }
//                arr[arr.length - 1] = 0;
//            }
//        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println("newArr = " + newArray[j]);
        }

    }
}
