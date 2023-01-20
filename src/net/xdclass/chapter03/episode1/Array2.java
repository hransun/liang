package net.xdclass.chapter03.episode1;

class Stu{
    private String name;
    private int age;
    public Stu(){}
    public Stu(String name,int age){
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

public class Array2 {
    public static void main(String[] args) {
        // 2d matrix
        Stu[][] grade = new Stu[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                grade[i][j] = new Stu("stu"+"_grade_"+i+"_class_"+j,12);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%s \t",grade[i][j]);
            }
            System.out.println();
        }
    }
}
