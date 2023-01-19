package net.xdclass.chapter03.episode1;

class Student {
    private String name;
    private int age;
    public Student() {

    }
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Array {
    public static void main(String[] args) {
        Student[] classRoom = new Student[45];
        for (int i = 0; i < 10; i++) {
            classRoom[i] = new Student("stu"+i,12);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(classRoom[i]);
        }
        System.out.println("init finished---------------");
    }
}
