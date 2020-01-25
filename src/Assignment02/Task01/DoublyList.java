package Assignment02.Task01;

public class DoublyList{
    public Node head;

    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int count=0;
        if (head==null){
        	return -1;
        } else{
        	for (Node x=head.next; x!=head; x=x.next){
        		count++;
        	}
        }
        return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO
        if (head==null){
        	System.out.printf("Error\n");
        } else{
        	for (Node x=head.next; x!=head; x=x.next){
        		if (x==head.prev){
        			System.out.print(x.element+".");
        		} else{
        			System.out.print(x.element+", ");
        		}
        	}
        }
        System.out.println();
    }
    
    public void backwardprint(){
        // TO DO
    	if (head==null){
    		System.out.printf("Error\n");
    	} else{
    		for (Node x=head.prev; x!=head; x=x.prev){
    			if (x==head.next){
    				System.out.print(x.element+".");
    			} else{
    				System.out.print(x.element+", ");
    			}	
    		}
    	}
    	System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        int size=countNode();
        if (idx<0 || idx>(size-1)){
            return head;
        } else{
            Node n=head.next;
            for (int i=0; i<idx; i++){
            	n=n.next;
            }
            return n;
        }
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        int p=0;
        for (Node x=head.next; x!=head; x=x.next){
            if (elem.equals(x.element)){
            	return p;
            }
            p++;
        }
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        int size=countNode();
        if (idx<0 || idx>size) {
            System.out.println("Invalid index");
        } else{
            Node in=new Node(elem, null, null);
            Node a=nodeAt(idx-1);
            Node o=nodeAt(idx);
            in.prev=a;
            in.next=o;
            o.prev=in;
            a.next=in;
        }
        size++;
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node n=nodeAt(index);
        Object temp= n.element;
        n.prev.next=n.next;
        n.next.prev=n.prev;
        return temp;
    }

}
