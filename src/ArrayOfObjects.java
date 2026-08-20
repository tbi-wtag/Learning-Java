class Student{
    int rollno;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) throws Exception{

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 1;
        s1.name = "John";
        s1.age = 20;        

        s2.rollno = 2;
        s2.name = "Alice";
        s2.age = 21;

        s3.rollno = 3;
        s3.name = "Bob";
        s3.age = 22;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //for(int i = 0; i < students.length; i++){
        //    System.out.println("Name: " + students[i].name + ", Age: " + students[i].age);
        //}

        for (Student s: students){
            System.out.println("Name:" + s.name + ", Age: " + s.age);
        }


    }
}
