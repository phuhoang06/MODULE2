package OOP.StopWatch;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên với 100,000 số
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        // Khởi tạo đối tượng StopWatch
        StopWatch stopWatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopWatch.start();

        // Thực hiện thuật toán sắp xếp chọn (Selection Sort)
        selectionSort(arr);

        // Dừng đo thời gian
        stopWatch.stop();

        // In ra thời gian thực thi
        System.out.println("Thời gian thực thi của Selection Sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    // Thuật toán sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

