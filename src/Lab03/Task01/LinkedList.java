package Lab03.Task01;

public class LinkedList {
    public Node head;

    /*
     * First Constructor: Creates a linked list using the values from the given
     * array. head will refer to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        head = new Node(a[0], null);
        Node tail = head;
        for (int i = 1; i < a.length; i++) {
            Node n = new Node(a[i], null);
            tail.next = n;
            tail = tail.next;
        }
    }

    /*
     * Second Constructor: Sets the value of head. head will refer to the given
     * LinkedList
     */
    public LinkedList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int count = 0;
        for (Node i = head; i != null; i = i.next) {
            count++;
        }
        return count;
    }

    /* prints the elements in the list */
    public void printList() {
        for (Node i = head; i != null; i = i.next) {
            if (i.next == null) {
                System.out.printf(i.element + ".");
            } else {
                System.out.printf(i.element + ", ");
            }
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index
    // return null.
    public Node nodeAt(int idx) {
        int size = countNode();
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return null;
        } else {
            Node n = head;
            for (int i = 0; i < idx; i++) {
                n = n.next;
            }
            return n;
        }
    }

    // returns the element of the Node at the given index. For invalid idx
    // return null.
    public Object get(int idx) {
        int size = countNode();
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return null;
        } else {
            Node n = head;
            for (int i = 0; i < idx; i++) {
                n = n.next;
            }
            return n.element;
        }
    }

    /*
     * updates the element of the Node at the given index. Returns the old
     * element that was replaced. For invalid index return null. parameter:
     * index, new element
     */
    public Object set(int idx, Object elem) {
        int size = countNode();
        if (idx < 0 || idx >= size) {
            return null;
        } else {
            Node n = head;
            int i;
            for (i = 0; i < idx; i++) {
                n = n.next;
            }
            if (i == idx) {
                Object temp = n.element;
                n.element = elem;
                return temp;
            }
            return null;
        }
    }

    /*
     * returns the index of the Node containing the given element. if the
     * element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.element == elem) {
                return c;
            } else {
                c++;
            }
        }
        return -1;
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        boolean flag = false;
        for (Node i = head; i != null; i = i.next) {
            if (i.element == elem) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    // Makes a duplicate copy of the given List. Returns the reference of the
    // duplicate list.
    public Node copyList() {
        Node copyHead = new Node(head.element, null);
        Node tail = copyHead;
        for (Node i = head.next; i != null; i = i.next) {
            Node n = new Node(i.element, null);
            tail.next = n;
            tail = tail.next;
        }
        return copyHead;
    }

    // Makes a reversed copy of the given List. Returns the head reference of
    // the reversed list.
    public Node reverseList() {
        Node reverseHead = new Node(head.element, null);
        Node tail = reverseHead;
        for (Node i = head.next; i != null; i = i.next) {
            Node n = new Node(i.element, null);
            n.next = tail;
            tail = n;
        }
        return tail;
    }

    /*
     * inserts Node containing the given element at the given index Check
     * validity of index.
     */
    public void insert(Object elem, int idx) {
        int size = countNode();
        Node n = new Node(elem, null);
        if (idx < 0 || idx > size + 1) {
            System.out.println("Invalid index");
        } else if (idx == 0) {
            n.next = head;
            head = n;
        } else {
            Node prev = nodeAt(idx - 1);
            n.next = prev.next;
            prev.next = n;
        }
        size++;
    }

    /*
     * removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        int size = countNode();
        Object removeValue;
        if (index < 0 || index > size - 1) {
            System.out.println("Invalid index");
            return null;
        } else if (index == 0) {
            removeValue = head.element;
            head = head.next;
            size--;
            return removeValue;
        } else {
            Node prev = nodeAt(index - 1);
            Node removeNode = prev.next;
            removeValue = removeNode.element;
            prev.next = prev.next.next;
            removeNode.element = null;
            removeNode.next = null;
            size--;
            return removeValue;
        }
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node n = head;
        Node tail = null;
        for (Node i = head; i != null; i = i.next) {
            tail = i;
        }
        tail.next = n;
        head = head.next;
        n.next = null;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        Node ptail = null;
        Node tail = null;
        for (Node i = head; i.next != null; i = i.next) {
            ptail = i;
            tail = i.next;
        }
        tail.next = head;
        head = tail;
        ptail.next = null;
    }
}
