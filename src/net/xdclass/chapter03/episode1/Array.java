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
        // add record
        classRoom[10] = new Student("stu10",12);
        for (int i = 10; i < 11; i++) {
            System.out.println(classRoom[i]);

        }
        System.out.println("add finished ------------------");

        // delete index = 2
        for (int i = 3; i < 11; i++) {
            classRoom[i-1] =  classRoom[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(classRoom[i]);

        }
        System.out.println("deleted finished ---------------");
        // modify
        classRoom[0] = new Student("modified student",20);
        System.out.println(classRoom[0]);
        System.out.println("modify finished---------------");
        // check
        System.out.println(classRoom[2]);
        System.out.println("check finished----------------");
    }
}
