package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

/**
 * A Simple Stack.
 * @param <E>
 * 
 */
public class Stack<E> implements Iterable<E> {
    private List<E> data = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.data.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E last = this.data.get(this.data.size() - 1);
        this.data.remove(last);
        return last;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.data.get(this.data.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        ArrayList<E> copy = this.toArrayList();
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> copy = new ArrayList<>();
        copy.addAll(this.data);
        Collections.reverse(copy);
        return copy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        Integer sum = 0;
        for (Integer x : stack) {
            sum += x;
        }
        return sum;
    }

    public static void prettyPrint(Stack<?> stack) {
        for (Object x : stack) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // List<String> s = new ArrayList<>(null);

        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        // System.out.println(stack.toArrayList());
        // for (String x : stack) {
        //     System.out.println(x);
        // }
        prettyPrint(stack);
    }

}