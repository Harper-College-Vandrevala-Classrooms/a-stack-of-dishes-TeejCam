package com.csc;

public class StackDriver
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        // The variable stack_size should equal zero.
        int stackSize = stack.getSize();

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        // The variable sizeAfterPushes should equal four.
        int sizeAfterPushes = stack.getSize();

        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = stack.peek();
        System.out.println(peekedDish);

        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = stack.pop();
        System.out.println(poppedDish);

        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = stack.pop();
        System.out.println(anotherPoppedDish);

        // The variable finalSize should equal two.
        int finalSize = stack.getSize();
    }
}