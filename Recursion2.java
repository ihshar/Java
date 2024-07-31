import java.util.ArrayList;
import java.util.HashSet;

public class Recursion2 {
    public static void reverseString(int index,String str){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.println(str.charAt(index));
        reverseString(index-1,str);
    }
    public static int first_Occ = -1;
    public static int last_Occ = -1;
    public static void occOfChar(String str,int index,char findChar){
        if(index==str.length()){
            System.out.println(first_Occ);
            System.out.println(last_Occ);
            return ;
        }


        char currentChar = str.charAt(index);

        if(currentChar==findChar){
            if(first_Occ==-1){
                first_Occ =index;
            }
            else{
                last_Occ = index;
            }
        }

        occOfChar(str, index+1, findChar);
    }
    public static boolean checkSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]<arr[i+1]){
            return checkSorted(arr, i+1);
        }
        else{
            return false;
        }
    }
    public static void move_X(String str,int counter,String newString,int index){
        if(index==str.length()){
            for(int i=0;i<counter;i++){
                newString = newString + 'x';
            }
            System.out.println(newString); 
            return ;
        }

        if(str.charAt(index)=='x'){
            move_X(str, counter+1, newString, index+1);
        }
        else{
            newString = newString+str.charAt(index);
            move_X(str, counter, newString, index+1);
        } 

    }
    public static boolean map [] = new boolean[26];
    public static void removeDuplicates(String str,int index,String newString){
        // if(index == str.length()-1){
        //     System.out.println(newString);
        //     return ;
        // }
        // char currentChar = str.charAt(index);
        // boolean found = false;
        
        // for(int i=0;i<newString.length();i++){
        //     if(newString.charAt(i)==currentChar){
        //         found = true;
        //     }
        // }

        // if(found){
        //     removeDuplicates(str, index+1, newString);
        // }
        // else{
        //     newString = newString+currentChar;
        //     removeDuplicates(str, index+1, newString);
        // }



        // answer using map
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar-'a']==true){
            removeDuplicates(str, index+1, newString);
        }
        else{
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicates(str, index+1, newString);
        }

    }
    public static void subsequence(String str,int index,String newString,HashSet<String> set){
        if(index== str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add (newString);
                System.out.println(newString);
                return;
            }
        }
        char currentChar = str.charAt(index); 
        // to be
        subsequence(str, index+1, newString+currentChar,set);
        // not to be
        subsequence(str, index+1, newString,set);
    }
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str,int index,String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);

        String mapping = keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }

    }
    public static void printPermutaion(String str,String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return ;
        }
        for(int i=0;i<str.length();i++){

            char currChar = str.charAt(i);

            String newString = str.substring(0, i)+str.substring(i+1);
            printPermutaion(newString, permutation+currChar);
        }
    }
    public static int countPath(int n,int m,int i,int j){
        if(i==n || j == m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        
        int Downward = countPath(n, m, i+1, j);
 
        int Rightward = countPath(n, m, i, j+1);

        
        return Downward+Rightward;
    }
    public static int waysToInvite(int n){
        
        if(n<=1){
            return 1;
        }

        // for single
        int ways1 = waysToInvite(n-1);

        // for pairs
        int ways2 = (n-1) * waysToInvite(n-2);
        
        return ways1+ways2;

    }
    public static void printSubsets(ArrayList<Integer> subsets){
        for(int i=0;i<subsets.size();i++){
            System.out.print(subsets.get(i)+" ");
        }
        System.out.println();
    }
    public static void subsetOfN(int n,ArrayList<Integer> subsets){
        
        if(n==0){
            printSubsets(subsets);
            return;
        }
        // take it
        subsets.add(n);
        subsetOfN(n-1,subsets);

        // don't take it
        subsets.remove(subsets.size()-1);
        subsetOfN(n -1,subsets);
    }
    public static void main(String[] args){
        // String str = "abcd";
        // int index = str.length()-1;
        // reverseString(index, str);

        // String str = "abaacdaefaah";
        // int index = 0;
        // char findChar = 'a';
        // occOfChar(str,index,findChar);

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int arr[] = {11,12,12,14,15};
        // int i=0;
        // boolean ans = checkSorted(arr,i);
        // System.out.println(ans);


        // String str = "axbcxxd";
        // String newString = "";
        // int counter = 0;
        // int index = 0;;
        // move_X(str,counter,newString,index);


        // String str = "abbccda";
        // int index= 0;
        // String newString="";
        // removeDuplicates(str,index,newString);

        // String str = "abc";
        // int index = 0;
        // String newString = "";
        // HashSet<String> set = new HashSet<>();
        // subsequence(str,index,newString,set);

        // String str = "23";
        // int index= 0;
        // String combination = "";
        // printCombination(str,index,combination);

        // String str = "abc";
        // String permutation = "";
        // printPermutaion(str,permutation);

        // int n =3,m=3;
        // int ans = countPath(n,m,0,0);
        // System.out.println(ans);


        // int n=4;
        // int ans = waysToInvite(n);
        // System.out.println(ans);

        int n=3;
        ArrayList<Integer> subsets = new ArrayList<>();
        subsetOfN(n,subsets);
    }
}
