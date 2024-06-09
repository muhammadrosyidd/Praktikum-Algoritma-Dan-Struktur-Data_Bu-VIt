public class cobapostfix {

    public int size;
    public char[] data;
    public int top;

    public cobapostfix(int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char temp = data[top];
            top--;
            return temp;
        } else {
            return '\0';
        }
    }

    public char peek () {
        if (!isEmpty()) {
            return data[top];
        } else {
            return '\0';
        }
    }

    public static boolean isOperand (char c){
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') 
        || (c >= '0' && c <= '9') || c == ' ' || c == '.');
    }

    public static boolean isOperator (char c){
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }
   

    public static int getDerajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                 return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversi(String infix) {
        cobapostfix operators = new cobapostfix(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            } else if(c == '('){
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && getDerajat(operators.peek()) >= getDerajat(c)) {
                    postfix = postfix + operators.pop();
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c-d)";
        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + konversi(infix));
    }
}

