public class Student {
    String name;
    int age;
    String course;

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Constructor with three parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Deepika");
        Student s2 = new Student("Deepika", 22);
        Student s3 = new Student("Deepika", 22, "Java Full Stack");
    }
}
