import java.util.Stack;

public class tugas {
    public static class PostfixEvaluator {
        public static int evaluatePostfix(String exp) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < exp.length(); i++) {
                char c = exp.charAt(i);

                if (Character.isDigit(c)) {
                    stack.push(c - '0'); 
                } else {
                    int val1 = stack.pop();
                    int val2 = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(val2 + val1);
                            break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                        case '*':
                            stack.push(val2 * val1);
                            break;
                        case '/':
                            stack.push(val2 / val1);
                            break;
                    }
                }
            }

            return stack.pop(); 
        }
    }

    public static void main(String[] args) {
        String postfix = "53+82-*"; 
        System.out.println("Postfix Evaluation: " + PostfixEvaluator.evaluatePostfix(postfix));
    }
}
