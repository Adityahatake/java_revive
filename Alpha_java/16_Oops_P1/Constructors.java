public class Constructors {
    public static void main(String[] args) {
        System.out.println("test");
        Student s1=new Student();
        s1.name="Anjali";
        System.out.println(s1.name);
        Student s2=new Student("aditya" , 10);
        Student s3= new Student(s2);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;
    int  marks[];
    Student(){ //non parameterized constructor
        System.out.println(" non parameterized constrctor is called");
    }
    Student(String name,int roll){ //parameterized constructor
    int  marks[] =new int[3];

        this.name=name;
        this.roll=roll;
    }
    // Student(Student s){ // shallow copy constructor
    // int  marks[] =new int[3];
    //     this.name=s.name;
    //     this.roll=s.roll;
    // }
     Student(Student s){ // Deep copy constructor
    int  marks[] =new int[3];
        this.name=s.name;
        this.roll=s.roll;
        for (int i = 0; i < marks.length; i++) {
            marks[i]=s.marks[i];
        }
    }
}
