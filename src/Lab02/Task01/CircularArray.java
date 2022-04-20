package Lab02.Task01;

public class CircularArray {

    private int start;
    private int size;
    private Object[] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null} then, CircularArray(lin, 2, 4)
     * will generate Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object[] lin, int st, int sz) {
        start = st;
        size = sz;
        cir = new Object[lin.length];

        int k = start;
        for (int i = 0; i < lin.length; i++) {
            cir[k] = lin[i];
            k = (k + 1) % cir.length;
            // (2+1) % 5 = 3 % 5 = 3
        }
    }

    // Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        for (int i = 0; i < cir.length; i++) {
            if (i == cir.length - 1) {
                System.out.print(cir[i] + ".");
            } else {
                System.out.print(cir[i] + ", ");
            }
        }
        System.out.println();
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        int k = start;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(cir[k] + ".");
            } else {
                System.out.print(cir[k] + ", ");
            }
            k = (k + 1) % cir.length;
        }
        System.out.println();
    }

    public void printBackward() {
        int last = ((start + size) - 1) % cir.length;
        for (int i = 0; i < size; i++) {
            if (last < 0) {
                last = cir.length - 1;
            }
            if (i == size - 1) {
                System.out.print(cir[last] + ".");
            } else {
                System.out.print(cir[last] + ", ");
            }
            last--;
        }
        System.out.println();
    }

    // With no null cells
    public void linearize() {
        Object[] temp = new Object[size];
        int k = start;
        for (int i = 0; i < size; i++) {
            temp[i] = cir[k];
            k = (k + 1) % cir.length;
        }
        cir = temp;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newCapacity) {
        Object[] temp = new Object[newCapacity];
        int k = start;
        int p = start;
        for (int i = 0; i < size; i++) {
            temp[p] = cir[k];
            p = (p + 1) % temp.length;
            k = (k + 1) % cir.length;
        }
        cir = temp;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newCapacity) {
        Object[] temp = new Object[newCapacity];
        int k = start;
        for (int i = 0; i < size; i++) {
            temp[i] = cir[k];
            k = (k + 1) % cir.length;
        }
        cir = temp;
        start = 0;
    }

    /*
     * pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length use resizeStartUnchanged()
     * for resizing.
     */
    public void insertByRightShift(Object elem, int pos) {
        if (pos > 0 || pos < size) {
            if (size == cir.length) {
                resizeStartUnchanged(cir.length + 3);
            }
            int nshift = size - pos;
            int from = ((start + size) - 1) % cir.length;
            int to = (from + 1) % cir.length;
            for (int i = 0; i < nshift; i++) {
                cir[to % cir.length] = cir[from % cir.length];
                to = from;
                from--;
                if (from < 0) {
                    from = cir.length - 1;
                }
            }
            cir[(start + pos) % cir.length] = elem;
            // System.out.println(size);
            size++;
        }
    }

    public void insertByLeftShift(Object elem, int pos) {
        if (pos > 0 || pos < size) {
            if (size == cir.length) {
                resizeStartUnchanged(cir.length + 3);
            }
            int nshift = pos + 1;
            int from = start;
            int to = from - 1;
            for (int i = 0; i < nshift; i++) {
                cir[to % cir.length] = cir[from % cir.length];
                to = from;
                from++;
            }
            cir[(start + pos) % cir.length] = elem;
            start--;
            size++;
        }
    }

    /*
     * parameter--> pos. pos --> position relative to start. Valid range of
     * pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos) {
        if (pos > 0 || pos < size - 1) {
            int nshift = size - pos - 1;
            int from = ((start + pos) + 1) % cir.length;
            int to = from - 1;
            if (to < 0) {
                to = cir.length - 1;
            }
            // int to=from--;
            for (int i = 0; i < nshift; i++) {
                cir[to % cir.length] = cir[from % cir.length];
                to = from;
                from++;
            }
            cir[(start + size - 1) % cir.length] = "null";
            // start++;
            size--;
        }
    }

    /*
     * parameter--> pos. pos --> position relative to start. Valid range of
     * pos--> 0 to size-1
     */
    public void removeByRightShift(int pos) {
        if (pos > 0 || pos < size - 1) {
            int nshift = pos;
            int from = ((start + pos) - 1) % cir.length;
            int to = (from + 1) % cir.length;
            // int to=from--;
            for (int i = 0; i < nshift; i++) {
                cir[to % cir.length] = cir[from % cir.length];
                to = from;
                from--;
                if (from < 0) {
                    from = cir.length - 1;
                }
            }
            cir[start] = "null";
            start++;
            size--;
        }
    }


    //This method will check whether the array is palindrome or not
    public void palindromeCheck() {
        boolean flag = true;
        int m = start;
        int n = ((start + size) - 1) % cir.length;

        for (int i = 0; i < size / 2; i++) {
            if (cir[m] == cir[n]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            m = (m + 1) % cir.length;
            n = (n + 1) % cir.length;
        }
        if (flag == true) {
            System.out.println("This array is a palindrome.");
        } else {
            System.out.println("This array is NOT a palindrome.");
        }
    }


    //This method will sort the values by keeping the start unchanged
    public void sort() {
        int k = start;
        for (int i = 0; i < size - 1; i++) {
            int p = (k + 1) % cir.length;
            for (int j = i + 1; j < size; j++) {
                if ((int) cir[p] < (int) cir[k % cir.length]) {
                    Object temp = cir[k];
                    cir[k] = cir[p];
                    cir[p] = temp;
                }
                p = (p + 1) % cir.length;
            }
            k = (k + 1) % cir.length;
        }
    }


    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k) {
        int p = k.start;
        int q = start;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (cir[q] == k.cir[p]) {
                counter++;
            } else {
                return false;
            }
            p = (p + 1) % cir.length;
            q = (q + 1) % k.cir.length;
        }
        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }

}
