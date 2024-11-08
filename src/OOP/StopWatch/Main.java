package OOP.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a = scanner.nextDouble();
        stopWatch.start();
        for (long i=0; i<a; i++){
            count++;
        }
        stopWatch.stop();
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Elapsed time is " + elapsedTime);
        System.out.println("Iterations is " + count);
    }
}

