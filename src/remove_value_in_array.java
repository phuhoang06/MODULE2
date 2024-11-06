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
        System.out.println("Luu y moi lan chi xoa 1 phan tu");
        int s;int x;
        boolean found ;
        do {
            found = false;

            System.out.print("nhap phan tu can xoa : ");
            x = sc.nextInt();
            for (s = 0; s < arr.length-1; s++) {
                if (arr[s] == x) {
                    found = true;
                    break;

                }
            }
            if (!found) {
                System.out.println("khong co phan tu nao nhu vay trong mang");
            }
        }while (!found);


        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                for (int k = j; k < arr.length -1 ; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Arr = " + arr[j]);
        }

    }
}
