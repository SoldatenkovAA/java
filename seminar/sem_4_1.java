package seminar;

import java.util.Stack;
//import java.util.Vector;

public class sem_4_1 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6 };
        // turnToStack(array);
        Stack<Integer> newStack = turnToStack(array);
        
        
        
        System.out.println(newStack);
    }

    static Stack<Integer> turnToStack(Integer[] array) {
        Stack<Integer> stack = new Stack<Integer>();
        for (Integer i : array) {
            stack.push(i);   //почему-то подчеркивает
        }
        System.out.println(stack);
        return stack;
    }
}
