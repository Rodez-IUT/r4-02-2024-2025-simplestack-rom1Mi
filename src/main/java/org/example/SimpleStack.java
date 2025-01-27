package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {

    private ArrayList<Item> list;
    public SimpleStack() {
        this.list = new ArrayList<Item>();
    }

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return this.list.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        this.list.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (this.list.isEmpty()){
            throw new EmptyStackException();
        }
        return this.list.get(this.list.size()-1);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (this.list.isEmpty()){
            throw new EmptyStackException();
        }
        Item tampon = this.peek();
        this.list.remove(this.list.size()-1);
        return tampon;
    }
}
