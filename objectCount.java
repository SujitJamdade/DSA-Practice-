package OOPS;

class Student{
    
    String std_name;
    int roll_number;
    static int count = 0;

    public Student(String n, int roll){
        std_name = n;
        roll_number = roll;
        count= count+1;
    }
    
}

public class objectCount{
    public static void main(String args[]){
        Student s1 = new Student("abc",10);
        System.out.println(s1.count);
        Student s2 = new Student("abc",11);
        System.out.println(s1.count);
        Student s3 = new Student("abc",12);
    
        System.out.println(s3.count);
    }
}