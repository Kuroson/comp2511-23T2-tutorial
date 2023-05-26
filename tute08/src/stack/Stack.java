package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 */
public class Stack<E> implements Iterable<E> {
    private List<E> elements = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.elements.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E last = this.peek();
        this.elements.remove(last);
        return last;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.elements.get(this.elements.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = new ArrayList<>(this.elements);
        // As its a stack, the first item should be the last item in hte list
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.elements.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return new ArrayList<E>(this.elements);
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        Integer total = 0;
        for (Integer i : stack) {
            total += i;
        }
        return total;
    }

    public static void prettyPrint(Stack<?> stack) {
        String output = "[";

        Iterator<?> iter = stack.iterator();
        for (int i = 0; i < stack.size() - 1; i++) {
            output += (iter.next() + " ");
        }

        System.out.println(output + "]");
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }

}