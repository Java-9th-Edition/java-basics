package Overloading;

class Queue {
    private char[] q;  // this array holds the queue
    private int putloc, getloc;  // the put and get indices

    // queue constructor
    Queue(int size) {
        q = new char[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    Queue(Queue ob) {
        // initialize putloc and getloc to the values in the ob parameter
        putloc = ob.putloc;
        getloc = ob.getloc;
        // allocate new array to hold queue and copy elements from ob.q to q
        q = new char[ob.q.length];

        // copy elements
        for (int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }
    // creates a queue large enough to hold the characters in a and then stores those characters in the queue
    Queue (char[] a) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    // put a character into the queue
    void put(char ch) {
        // check if the queue is full first
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        // new element is stored at putloc location first and putloc is incremented
        q[putloc] = ch;
        putloc++;
    }

    // get a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}


public class QDemo2 {
}
