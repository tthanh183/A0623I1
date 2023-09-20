package _5accessmodifier;

public class Student {
    private String name;
    private String classes;

    Student() {
        this.name = "John";
        this.classes = "CO2";
    }
    public String setName(String name) {
        this.name = name;
    }
    public String setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Peter");
        student.setName("C01");
    }
}
