public class Queue{
    public int[] data;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue (int max){
        this.max= max;
        this.data = new int[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull(){
        return (size == max);
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+ data[front]);
        }else {
            System.out.println("Queue kosong");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            int  i = front;

            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen: "+size);
        }
    }

    public void clear(){
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int dt) {
        if (isFull()) {
        System.out.println("Queue sudah penuh");
        } else {
        if (isEmpty()) {
        front = rear = 0;
        } else if (rear == max - 1) {
        rear = 0;
        } else {
        rear = rear + 1;
        
        }
        
        data[rear] = dt;
        size++;
        
        }
    }

    public int dequeue() {
        int temp = 0;
        
        if (isEmpty()) {
        System.out.println("Queue masih kosong");
        } else {
        temp = data[front];
        size --;
        
        if (isEmpty()) {
        front = rear = -1;
        } else if (front == max - 1) {
        front = 0;
        } else {
        front++;
        
        }
        
        }
        
        return temp;
    }
}