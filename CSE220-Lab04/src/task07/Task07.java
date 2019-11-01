package task07;

public class Task07 {
	
    public static void reverse(Node p){
        if (p!=null){
            reverse(p.next);
            System.out.println(p.element);
        }
    }
    
    public static void main(String[] args){
    	
        Object a[]={10, 20, 30, 40};
        
        Node head=new Node(a[0],null);
        Node tail=head;
        
        for (int i=1; i<a.length; i++){
            Node n= new Node(a[i],null);        
            tail.next=n;
            tail=n;
        }
        //tail.next=null;
        reverse(head);
    }

}
