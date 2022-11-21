package com.interleave;

import java.util.Stack;

/**
 * Given a stack of N elements, interleave the first half of
 * the stack with the second half reversed using only one
 * other queue. This should be done in place.
 * 
 * Recall that you can only push or pop from a stack, and 
 * enqueue or dequeue from a queue.
 * 
 * For example, if the stack is [1, 2, 3, 4, 5], it should
 * become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it 
 * should become [1, 4, 2, 3]
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Generate stack with N elements
        int n = 5;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        for (Integer item: stack) {
            System.out.printf("%d\t", item);
        }
        System.out.println();
        interLeave(stack);
    }

    private static Stack<Integer> interLeave(Stack<Integer> elements) {
        int middle = elements.size()/2;
        System.out.println("Middle element = " + middle);
        // Split stack in half
        // Merge Left 1st, right last, left 2nd, right 2nd to last
        
        return elements;
    }
}
