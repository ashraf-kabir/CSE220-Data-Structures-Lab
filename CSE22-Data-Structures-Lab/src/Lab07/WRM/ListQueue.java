package Lab07.WRM;

public class ListQueue implements Queue {
	int size;
	Node front;
	Node rear;

	public ListQueue() {
		size = 0;
		front = null;
		rear = null;
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

	public void enqueue(Object o) throws QueueOverflowException {
		// @No overflow for pushing while forming linked list
		// Adds the new item on the back of the queue, throwing the
		// QueueOverflowException if the queue is at maximum capacity. It
		// does not throw an exception for an "unbounded" queue, which
		// dynamically adjusts capacity as needed.
		if (size == 0) {
			Node k = new Node(o, null);
			size++;
			front = k;
			rear = k;
		} else {
			Node k = rear;
			Node m = new Node(o, null);
			size++;
			rear = m;
			k.next = m;
		}
	}

	// Removes the item in the front of the queue, throwing the
	// QueueUnderflowException if the queue is empty.
	public Object dequeue() throws QueueUnderflowException {
		if (size <= 0) {
			throw new QueueUnderflowException();
		} else {
			Object c = front.val;
			Node k = front;
			front = front.next;
			k = null;
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
		return front.val;
	}

	// Returns a textual representation of items in the queue, in the
	// format "[ x y z ]", where x and z are items in the front and
	// back of the queue respectively.
	public String toString() {
		if (size == 0) {
			return "Empty Que";
		}
		String sum = "";

		Node i = front;
		for (Node n = front; n != null; n = n.next) {
			if (i == front) {
				sum = "[ " + sum + n.val + " ";
			} else if (i == rear) {
				sum = sum + n.val + " ]";
			} else {
				sum = sum + n.val + " ";
			}
			i = i.next;
		}
		return sum;
	}

	// Returns an array with items in the queue, with the item in the
	// front of the queue in the first slot, and back in the last slot.
	public Object[] toArray() {
		Object[] a = new Object[size];

		int c = 0;
		for (Node n = front; n != null; n = n.next) {
			a[c] = n.val;
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
		for (Node n = front; n != null; n = n.next) {
			if (n.val == o) {
				return count;
			}
			count++;
		}
		return -1;
	}

	// TO DO
}
