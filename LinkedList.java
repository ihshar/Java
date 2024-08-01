/**
 * LinkedList
 */
class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void main(String [] args){
        int arr[] = {12,4,5,7,3};

        Node n1 = new Node(arr[0]);

        System.out.println(n1.data);
    }
    
}