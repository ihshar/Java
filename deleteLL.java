class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
class deleteLL {
    public static Node convertToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node removeHead(Node head){
        Node temp = head;
        
        if(head==null) return head;
        head = head.next;
        temp.next=null;
        return head;
        
    }
    public static Node removeTail(Node head){
        Node temp = head;

        if(head==null || head.next==null) return null;
        
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next = null;

        return head;

    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        
        Node head = convertToLL(arr);
        // head = removeHead(head);
        head = removeTail(head);
        printLL(head);
        
    }
}