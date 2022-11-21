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
 * I used arrys because I couldn't figure it out with only a queue
 */
public class App 
{
    public static void main( String[] args )
    {
        // Generate stack with N elements
        int n = 7;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        // Print old stack
        printStack("Old", stack);
        // Reorder stack
        interLeave(stack);
        // Print new
        printStack("New", stack);
    }

    private static Stack<Integer> interLeave(Stack<Integer> elements) {
        // Find the middle
        int middle = elements.size()/2;
        // Size
        int size = elements.size();
        // Arrays for sorting elements
        int[] leftArr = new int[middle];
        int[] rightArr = new int[elements.size() - middle];
        // Split stack in half
        // Left
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = elements.pop();
        }
        // Right
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = elements.pop();
        }
        // Merge Left 1st, right last, left 2nd, right 2nd to last
        // Counts for iterating
        int countLeft = 0;
        int countRight = rightArr.length - 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0 && countRight >= 0) {
                elements.push(rightArr[countRight]);
                countRight--;
            }
            else {
                elements.push(leftArr[countLeft]);
                countLeft++;
            }
        }
        return elements;
    }

    private static void printStack(String type, Stack<Integer> stack) {
        System.out.printf("\n%s Stack: ", type);
        for (Integer item: stack) {
            System.out.printf("%d\t", item);
        }
        System.out.println();
    }
}
