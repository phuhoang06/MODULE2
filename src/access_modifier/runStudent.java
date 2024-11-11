package access_modifier;

public class runStudent {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"son");
        Student s2 = new Student(222,"long");
        s1.display();
        s2.display();
    }
}
