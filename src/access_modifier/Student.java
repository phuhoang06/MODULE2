package access_modifier;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
