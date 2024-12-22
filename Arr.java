
class Student {

    int roll;
    String name;

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() {

    }
}

public class Arr {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 78;
        s1.name = "Yyhj";

        Student s2 = new Student(s1);
        s1.roll = 33;

        System.out.println(s1.roll);
        System.out.println(s2.roll);
    }
}
