import java.util.*;
public class BitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;

        // // GetBit
        // int BitMask = 1<<pos;
        // if((BitMask & n)==0){
        //     System.out.println("Bit was zero");
        // }
        // else{
        //     System.out.println("Bit was one");
        // }

        // // SetBit

        // int newNumber = BitMask | n;

        // System.out.println(newNumber);
        

        // ClearBit
        // int BitMask = 1<<pos;
        // int notBitMask = ~(BitMask);
        
        // int newNumb = notBitMask & n;

        // System.out.println(newNumb);


        // UpdateBit

        // operation 1:oper = 1; operation 0:oper = 0;
        int oper = sc.nextInt();
        int BitMask = 1<<pos;
        if(oper==1){
            // set operation
            int updateToOne = BitMask | n;
            System.out.println(updateToOne);
        }else{
            // clear operation
            int notBitMask = ~(BitMask); //newBitMask is not of BitMask
            int updateToZero = notBitMask & n;
            System.out.println(updateToZero);
        }

        sc.close();

    }
}
