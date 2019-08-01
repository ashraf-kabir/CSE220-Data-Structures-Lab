package task01;

public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        boolean flag=false;
        if (size==0){
            return true;
        }
        return flag;
    }
    public void push(Object e) throws StackOverflowException{            //insert
        if (size==data.length || size>data.length || size<0){
            throw new StackOverflowException();
        } else{
            data[size]=e;
            size++;
        }
    }
    public Object pop() throws StackUnderflowException{             //remove
        int end=size-1;
        if (size==0){
            throw new StackUnderflowException();
        } else{
        	Object p=data[end];
        	data[end]=0;
            size--;
            return p;
        }
    }
    public Object peek() throws StackUnderflowException{
        int end=size-1;
        if (size==0){
            throw new StackUnderflowException();
        }  
        return data[end];
    }
    public String toString(){
        String p="";
        for (int i=size-1; i>=0; i--){
            p+=data[i]+" ";
        }
        if (size==0){
            return p+"Empty Stack";
        } else{
            return p;
        }
    }
    public Object[] toArray(){
        Object p[]=new Object[size];
        for (int s=size-1,ps=0; ps<size; s--,ps++){
            p[ps]=data[s];
        }
        return p;
    }
    public int search(Object e){
        int p=0;
        for (int s=size-1; s>=0; s--){
            if (e==data[s]){
                return p;
            }
            else{
                p++;
            }
        }
        return -1;
    }
    
}
