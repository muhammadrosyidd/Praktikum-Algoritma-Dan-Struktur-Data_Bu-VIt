public class stackdemo {
    public static void main(String[] args) {
    stack myStack = new stack(10);
    
    myStack.push("Basis Data");
    myStack.push("Algoritma dan Struktur Data");
    myStack.push("Matematika");
    
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    
    }
    
    }