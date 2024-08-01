/**
 * polymorphism
 */
/**
 
 */
class Person{
    String name;
    int age;


    public void personInfo(String name){
        System.out.println(name);
        System.out.println("1");

    }

    public void personInfo(int age){
        System.out.println(age);
        System.out.println("2");
    }

    public void personInfo(String name,int age){
        System.out.println(name+" "+age);
        System.out.println("3"); //no need to write this ,this is just to track which function is running

    }
}
public class polymorphism {
   public static void main(String[] argrs){
        Person p1 = new Person();
        p1.name = "Himanshu";
        p1.age = 24;
        p1.personInfo(p1.name,p1.age);
   }
    
}