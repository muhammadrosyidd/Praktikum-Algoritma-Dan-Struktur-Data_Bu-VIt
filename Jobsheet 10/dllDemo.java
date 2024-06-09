public class dllDemo {
    public static void main(String[] args) {
        dll myDDL = new dll();
        myDDL.print();
        myDDL.addFirst(800);
        myDDL.reversePrint();
        myDDL.addFirst(700);
        myDDL.reversePrint();
        myDDL.addLast(500);
        myDDL.reversePrint();
        myDDL.removeFirst();
        myDDL.reversePrint();
        myDDL.removeLast();
        myDDL.reversePrint();
        // myDDL.reversePrint();
    }
}
