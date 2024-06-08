import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if(symbol == '+'){
            result = a+b;
            System.out.println(result);
        }
        else if(symbol == '-'){
            result = a-b;
            System.out.println(result);
        }
        else if(symbol == '*'){
            result = a*b;
            System.out.println(result);
        }
        else if(symbol == '/'){
            result = a/b;
            System.out.println(result);
        }
        else if(symbol == '%'){
            result = a%b;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid Operation");
        }


        sc.close();
    }
}
