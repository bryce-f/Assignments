package main;
import java.util.Stack;

public class JavaEnv {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        Integer minValue = Integer.MAX_VALUE;
        pushValue(myStack, minValue, 3);
        pushValue(myStack, minValue, 5);
        getMin(myStack, minValue);



    }

    static void popValue(Stack<Integer> myStack, Integer minValue) {
        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer value = myStack.pop();
        System.out.print("Top value removed ");

        if (value < minValue) {
            minValue = 2 * minValue - value;
        }
        else {
            System.out.println(value);
        }

    }

    static void pushValue(Stack<Integer> myStack, Integer minValue, Integer value) {
        if (myStack.isEmpty()) {
            minValue = value;
            myStack.push(value);
            System.out.println("Number added " + value);
            return;
        }

        if (value < minValue) {
            myStack.push(2 * value - minValue);
            minValue = value;
        }
        else {
            myStack.push(value);
            System.out.println("Number added " + value);
        }
    }


    static void peekValue(Stack<Integer> myStack, Integer minValue) {
        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer value = myStack.peek();

        System.out.print("Top value is ");

        if (value < minValue) {
            System.out.println(minValue);
        }
        else {
            System.out.println(value);
        }


    }

    static void getMin(Stack<Integer> myStack, Integer minValue) {
        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack min value = " + minValue);
        }
    }



}

