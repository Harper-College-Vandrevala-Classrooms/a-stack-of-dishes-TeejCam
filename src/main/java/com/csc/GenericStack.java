package com.csc;

public class GenericStack<T>
{
    private T arr[];
    private int top;
    private int capacity;

    GenericStack() {
        arr = (T[]) new Object[5];
        capacity = 5;
        top = -1;
    }

    public void push(T x) {
        if(isFull()){
            System.out.println("Stack is full!");
            System.exit(1);
        }
        System.out.println("Inserting " + x + " onto the stack");
        arr[++top] = x;
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            System.exit(1);
        }
        System.out.println("Popping item from stack...");
        return arr[top--];
    }

    public T peek() {
        return arr[top];
    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity -1;
    }

    public void printStack() {
        System.out.println("Printing items in the stack: ");
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
    }
}