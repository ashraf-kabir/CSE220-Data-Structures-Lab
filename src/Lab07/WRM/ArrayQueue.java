package Lab07.WRM;

public class ArrayQueue implements Queue {
	int size;
	int front;
	int rear;
	Object[] data;

	public ArrayQueue() {
		size = 0;
		front = -1;
		rear = -1;
		data = new Object[5];
	}

	// The number of items in the queue
	public int size() {
		return size;
	}

	// Returns true if the queue is empty
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	// Adds the new item on the back of the queue, throwing the
	// QueueOverflowException if the queue is at maximum capacity. It
	// does not throw an exception for an "unbounded" queue, which
	// dynamically adjusts capacity as needed.
	public void enqueue(Object o) throws QueueOverflowException {
		if (size == data.length) {
			throw new QueueOverflowException();
		} else {
			if (size == 0) {
				rear++;
				data[rear] = o;
				front++;
				size++;
			} else {
				rear++;
				data[rear] = o;
				size++;
			}

		}
	}

	// Removes the item in the front of the queue, throwing the
	// QueueUnderflowException if the queue is empty.
	public Object dequeue() throws QueueUnderflowException {
		if (size == 0) {
			throw new QueueUnderflowException();
		} else {
			Object c = data[front];
			data[front] = null;
			front++;
			// rear--;
			size--;
			return c;
		}

	}

	// Peeks at the item in the front of the queue, throwing
	// QueueUnderflowException if the queue is empty.
	public Object peek() throws QueueUnderflowException {
		if (size == 0) {
			throw new QueueUnderflowException();
		}
		return data[front];
	}

	// Returns a textual representation of items in the queue, in the
	// format "[ x y z ]", where x and z are items in the front and
	// back of the queue respectively.
	public String toString() {
		if (size == 0) {
			return "Empty Que";
		}
		String sum = "";
		int c = front;

		// @@ During dequeue,the front changed,it is no longer 0

		for (int i = 0; i < size; i++) {
			sum = sum + data[c] + " ";
			c++;
		}
		// for(int i=front;i<=rear;i++){//Both for loop is correct
		//
		// sum=sum+data[i]+" ";//First one to pop adds first.
		// //In stack first one pops last but in que first one pops first
		// }
		return sum;

	}

	// Returns an array with items in the queue, with the item in the
	// front of the queue in the first slot, and back in the last slot.
	public Object[] toArray() {
		Object[] a = new Object[size];
		int c = front;
		for (int i = 0; i < size; i++) {
			a[i] = data[c];
			c++;
		}
		return a;
	}

	// Searches for the given item in the queue, returning the
	// offset from the front of the queue if item is found, or -1
	// otherwise.
	public int search(Object o) {
		if (size == 0) {
			return -1;
		}
		int count = 0;
		for (int i = front; i <= rear; i++) {
			if (data[i] == o) {
				return count;
			}
			count++;
		}
		return -1;
	}

	// TO DO

}
