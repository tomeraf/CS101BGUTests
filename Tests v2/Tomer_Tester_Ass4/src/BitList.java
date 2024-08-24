
import java.util.LinkedList;
import java.util.Iterator;

public class BitList extends LinkedList<Bit> {
    private int numberOfOnes;

    // Do not change the constructor
    public BitList() {
        numberOfOnes = 0;
    }

    // Do not change the method
    public int getNumberOfOnes() {
        return numberOfOnes;
    }

//----------write your code BELOW this line only!!!---------------------------------------------------------
    
//=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.1 ================================================

    public void addLast(Bit element) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public void addFirst(Bit element) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public Bit removeLast() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public Bit removeFirst() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.2 ================================================
    public String toString() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }
    
    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.3 ================================================
    public BitList(BitList other) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.4 ================================================
    public boolean isNumber() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }
    
    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.5 ================================================
    public boolean isReduced() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public void reduce() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }


    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.6 ================================================
    public Bit shiftRight() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public void shiftLeft() {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.7 ================================================
    public void padding(int newLength) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    
//----------write your code ABOVE this line only!!!---------------------------------------------------------

    //----------------------------------------------------------------------------------------------------------
    // The following overriding methods must not be changed.
    //----------------------------------------------------------------------------------------------------------
    public boolean add(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public void add(int index, Bit element) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public Bit remove(int index) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offer(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offerFirst(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offerLast(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public Bit set(int index, Bit element) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Do not use this method!");
    }
}
