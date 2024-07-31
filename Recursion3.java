import java.util.*;
public class Recursion3 {
    public static void subsequence(int arr[],int index,ArrayList<Integer> result){
        if(index>=arr.length){
            if(result.size() == 0){
                System.out.println("{}");
            }
            else{
                for(int i=0;i<result.size();i++){
                    
                    System.out.print(result.get(i)+" ");
                }
                System.out.println();
            }
            return;
        }
        
        
        // take it 
        int currEle = arr[index];
        result.add(currEle);
        subsequence(arr,index+1,result);
        
        //Don't take it
        result.remove(result.size()-1); // Because it's not necessary that the element removing is the same element, we added previously so that why remove from end of the result list 
        subsequence(arr,index+1,result);
    }
    public static void main(String[] args) {
        int arr[] ={3,2,1};
        ArrayList<Integer> result = new ArrayList<>();
        subsequence(arr,0,result);
    }
}


