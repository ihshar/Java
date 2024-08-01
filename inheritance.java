/**
 * inheritance
 */
class Shape{ // base class or Parent class
    String color;

}
class Triangle extends Shape{  // subclass or child class
    int area;
}
public class inheritance {
    public static void main(String[] args){
        // Shape s1 = new Shape();
        // s1.color = "blue";

        Triangle t1 = new Triangle();
        t1.color="orange";
        t1.area=24;


    }
    
}