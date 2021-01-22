import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] stack1 = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for (int j : stack1) {
            stack.push(j);
        }
        for (int i = 0; i < stack1.length; i++) {
            stack1[i] = stack.pop();
        }
        System.out.println(Arrays.toString(stack1));
    }
}
