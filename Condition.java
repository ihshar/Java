import java.util.*;

public class Condition{
    public static void main(String[] args) {
        // Scanner is used for taking input in java 
        Scanner sc = new Scanner(System.in);
        // and this "nextInt" is which type of data we are inputing
        int a = sc.nextInt();
        // int b = sc.nextInt();

        //condition statement

        // if or else question

        // if(number>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Teenager");
        // }


        // odd or even question
        // if(number%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }


        // equal ,less ,greater question
        // if(a==b){
        //     System.out.println("Equal");
        // }
        // else if(a>b){
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }

        // 5 = hello , 6 = namaste, 7= bonjour
        switch(a){
            case 5:System.out.println("Hello");
            break;
            case 6:System.out.println("Namaste");
            break;
            case 7:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid button");
        }


        //sc.close() is for this warning "Resource leak: 'sc' is never closed"
        sc.close();



    }
}