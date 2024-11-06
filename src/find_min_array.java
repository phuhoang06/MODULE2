import java.util.Scanner;

public class find_min_array {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array : ");
            size = sc.nextInt();
            arr = new int[size];
            if (size > 20){
                System.out.println("Nhap so luong nho hon");
            }
        }while (size > 20);
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int index = minValue(arr);
        System.out.println("the smallest element is " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
