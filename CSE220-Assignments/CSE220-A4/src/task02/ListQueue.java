package task02;

public class ListQueue implements Queue {
	int size;
	Node front;
	Node rear;

	public ListQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(Object o) throws QueueOverflowException {
		// Node m=front;
		if (size == 0) {
			front = new Node(o, null);

			rear = front;
			// m=rear;
		}

		else {
			Node h = new Node(o, null);
			rear.next = h;
			rear = h;
		}
		size = size + 1;
	}

	public Object dequeue() throws QueueUnderflowException {
		if (size == 0) {
			front = null;
			rear = null;
			throw new QueueUnderflowException();
		} else if (front.next != null) {
			front = front.next;
			size = size - 1;
		}
		return front.val;
	}

	public Object peek() throws QueueUnderflowException {
		if (size == 0) {
			throw new QueueUnderflowException();
		} else {
			return front.val;
		}
	}

	public String toString() {
		String s = "[";
		// int m=front;
		for (Node n = front; n != null; n = n.next) {
			s = s + n.val + " ";
			// m=(front+1)%data.length;
		}
		s = s + "]";
		return s;
	}

	public Object[] toArray() {
		Object[] nw = new Object[size];
		int i = 0;
		for (Node n = front; n != null; n = n.next) {
			nw[i] = n.val;
			i++;
		}
		return nw;
	}

	public int search(Object o) {
		int flag = 0;
		int p = 0;
		for (Node n = front; n != null; n = n.next) {
			if (n.val == o) {
				flag = 1;
				break;
			}
			++p;
			// m=(front+1)%data.length;;
		}
		if (flag == 1) {
			return p;
		} else {
			return -1;
		}
	}

}
