package task06;

public class Task06 {
	
    public static int linkAdd(Node x){
        if (x==null){
        	return 0;
        } else {
        	return ((int) x.element+linkAdd(x.next));
        }
    }
    
    public static void main(String[] args){
    	
        Object a[] = {10, 20, 30, 40};
        
        Node head=new Node(a[0],null);
        Node tail=head;
        
        for (int i=1; i<a.length; i++){
            Node n=new Node(a[i],null);        
            tail.next=n;
            tail=tail.next;
        }
        System.out.println(linkAdd(head));
    }

}
