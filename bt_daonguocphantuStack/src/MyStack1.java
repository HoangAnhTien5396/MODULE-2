import java.util.Stack;

public class MyStack1 {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        StringBuilder string = new StringBuilder("CodeGym");
        System.out.println("\nChuỗi ban đầu: " + string);
        for (int i = 0; i < string.length(); i++) {
            stack1.push(string.charAt(i));
        }
        int x = string.length();
        string = new StringBuilder();
        for (int i = 0; i < x; i++) {
            string.append(stack1.pop());
        }
        System.out.println("Chuỗi sau khi đảo: " + string);
    }
}

