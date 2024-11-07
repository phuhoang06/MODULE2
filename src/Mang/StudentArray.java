package Mang;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Vuong","Phu","Huy","Dung","Manh","Son"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Posittion of the students in the list " + input_name + " is: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("not found" + input_name + "is in the list");
        }
    }
}
