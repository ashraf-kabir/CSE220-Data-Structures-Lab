package task01;

public class ListStack implements Stack{
    int size;
    Node top;
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
    public int size(){
        int count=0;
        for (Node p=top; p!=null; p=p.next){
            count++;
        }
        return count;
    }
    public boolean isEmpty(){
        return false;
    }
    public void push(Object e) throws StackOverflowException{
        Node p=new Node(e, null);
        if (top==null){
            top=p;
            size++;
        }
        else{
            p.next=top;
            top=p;
            size++;
        }
    }
    public Object pop() throws StackUnderflowException{
        if (top==null){
            throw new StackUnderflowException();
        }
        else{
            Object p=top.val;
            top=top.next;
            size--;
            return p;
        }
    }
    public Object peek() throws StackUnderflowException{
        if (top==null){
            throw new StackUnderflowException();
        }    
        else{
            return top.val;
        }
    }
    public String toString(){
        String p="";
        for (Node s=top; s!=null; s=s.next){
            p+=s.val+" ";
        }
        if (top==null){
            return "Empty stack";
        }
        else{
            return p;
        }
    }
    public Object[] toArray(){
        Object p[]=new Object[size];
        int ps=0;
        for (Node s=top; s!=null; s=s.next){
            p[ps]=s.val;
            ps++;
        }
        return p;
    }
    public int search(Object e){
        int p=0;
        for (Node s=top; s!=null; s=s.next){
            if (e==s.val){
                return p;
            }
            else{
                p++;
            }
        }
        return -1;
    }
    
}
