package StaticMethod;

public class Test {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Son");
        Student s2 = new Student(222, "Toan");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
