/**
 * OOPS
 */
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Himanshu";
        s1.age = 24;

        s1.printInfo(); 
    }  
}