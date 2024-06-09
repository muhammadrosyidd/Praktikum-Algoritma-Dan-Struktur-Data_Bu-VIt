public class Linkedlist {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()){
            System.out.println("Isi Linked List: ");
            Node currentNode = head;

            while (currentNode != null){
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        }else{
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if (!isEmpty()){
            Node currentNode = head;

            do{
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }while (currentNode != null);
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void insertAt(int index, int key){
        Node newNode = new Node(key, null);
        if (index < 0){
            System.out.println("Index tidak valid");
        }else if (index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node current = head;
            int currentIndex = 0;
            while (currentIndex < index - 1){
                current = current.next;
                currentIndex++;
            }
            if (current == null){
                System.out.println("Index melebihi batas");
            }else{
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void insertBefore(int key, int input){
        Node newNode = new Node(input, null);

        if (!isEmpty()){
            if (head.data == key){
                newNode.next = head;
                head = newNode;
            }else{
                Node currentNode = head;
                Node prevNode = null;
                do{
                    if (currentNode.data == key){
                        newNode.next = currentNode;
                        prevNode.next = newNode;
                        break;
                    }
    
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }while (currentNode != null);
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public int getData(int index){
        Node currentNode = head;

        for (int i = 0 ; i < index ; i++){
            currentNode = currentNode.next;
            if(currentNode == null){
                System.out.println("Indeks Melebihi Batas isi Linked List");
                return - 1;
            }
        }

        return currentNode.data;
    }

    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null){
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        }else if(head.next == null){
            head = null;
        }else{
            Node currentNode = head;

            while (currentNode.next != null){
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        }else if(head.data == key){
            removeFirst();
        }else{
            Node currentNode = head;

            while(currentNode.next != null){

                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt (int index){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
        }else if(index == 0){
            removeFirst();
        }else{
            Node currentNode = head;
            int listIndex = 0;
            while(currentNode.next != null && listIndex < index){

                if (listIndex == index - 1){
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
                listIndex++;
            }
        }
    }
} 
    

