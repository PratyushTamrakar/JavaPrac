package OOP;

public class StudentInfo {
    String name;
    int age;
    double marks;

    StudentInfo(String theName, int age, double marks){
        this.name = theName;
        this.age = age;
        this.marks = marks;

    }
    void display(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
        System.out.printf("Marks : %.2f \n",marks);
    }

}
