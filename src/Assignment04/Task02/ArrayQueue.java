package Assignment04.Task02;

public class ArrayQueue implements Queue {
	int size;
	int front;
	int rear;
	Object[] data;

	public ArrayQueue() {
		size=0;
		front=-1;
		rear=-1;
		data=new Object[5];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(Object o) throws QueueOverflowException {
		if (size==0) {
			data[0]=o;
			front=0;
			rear=0;
		}
		if (size>=data.length) {
			throw new QueueOverflowException();
		} else {
			rear=(rear+1)%data.length;
			data[rear]=o;
		}
		size=size+1;
	}
	
	public Object dequeue() throws QueueUnderflowException {
		if (size==0) {
			front=-1;
			rear=-1;
			throw new QueueUnderflowException();
		} else {
			front=(front+1)%data.length;
			// data[rear]=o;
			size=size-1;
		}
		return front;
	}
	
	public Object peek() throws QueueUnderflowException {
		if (size == 0) {
			throw new QueueUnderflowException();
		} else {
			return data[front];
		}
	}
	
	public String toString() {
		String s = "[";
		int m = front;
		for (int i = 0; i < size; ++i) {
			s = s + data[m] + " ";
			m = (m + 1) % data.length;
		}
		s = s + "]";
		return s;
	}
	
	public Object[] toArray() {
		Object[] nw = new Object[size];
		int m = front;
		for (int i = 0; i < size; ++i) {
			nw[i] = data[m];
			m = (m + 1) % data.length;
		}
		return nw;
	}
	
	public int search(Object o) {
		int flag = 0;
		int x = 0;
		int m = front;
		for (int i = 0; i < size; i++) {
			if (data[m] == o) {
				flag = 1;
				break;
			}
			++x;
			m = (front + 1) % data.length;
			;
		}
		if (flag == 1) {
			return x;
		} else {
			return -1;
		}
	}
}
