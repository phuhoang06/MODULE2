package OOP.StopWatch;

import java.util.Random;

public class Main {
    // [Bài tập] Xây dựng lớp StopWatch
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        System.out.println("========Start========");
        int[] arr = randomNumbers(100000, 1, 1000000000);
        long count1 = 0;

        watch.start();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                count1 ++;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        watch.stop();
        long elapsedTime1 = watch.getElapsedTime();

        System.out.println("========Start========");
        int[] arr2 = randomNumbers(100000, 1, 1000000000);
        long count2 = 0;

        watch.start();
        for (int i = 1; i < arr2.length; i++) {
            for (int j = i; j > 0; j--) {
                count2 ++;
                if (arr2[j-1] < arr2[j]) {
                    int temp = arr2[j-1];
                    arr2[j-1] = arr2[j];
                    arr2[j] = temp;
                } else {
                    break;
                }
            }
        }
        watch.stop();
        long elapsedTime2 = watch.getElapsedTime();

        System.out.println("Elapsed time 1: " + elapsedTime1);
        System.out.println("Elapsed time 2: " + elapsedTime2);

        System.out.println("Total iterations 1: " + count1);
        System.out.println("Total iterations 2: " + count2);
    }
    public static int[] randomNumbers(int n, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}

