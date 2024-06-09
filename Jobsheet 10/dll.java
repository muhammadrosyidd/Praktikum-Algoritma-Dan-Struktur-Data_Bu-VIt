
public class dll {
    node head;
    node tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List: ");
            node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;

            }

            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input) {
        node newNode = new node(input);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int input) {
        node newNode = new node(input);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        node newNode = new node(input);

        if (!isEmpty()) {
            node currentNode = head;

            do {
                if (currentNode.data == key) {
                    if (currentNode == tail) {
                        addLast(input);
                    } else {
                        newNode = currentNode.next;
                        currentNode.prev = newNode;
                        newNode = currentNode.prev;
                        currentNode = newNode.next;
                    }
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked List Kosong");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List Kosong");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void reversePrint() {
        if (!isEmpty()) {
            System.out.print("Isi linked list (reverse): ");
            node currentNode = tail;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.prev;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

}
