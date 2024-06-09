public class QueuePasien {
    public Pasien [] data;
    public int max;
    public int size;
    public int front;
    public int rear;

    public QueuePasien (int max){
        this.max = max;
        this.data = new Pasien[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull (){
        return (size == max);
    }

    public void peekFront(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: \n" + data[front]);
        }else{
            System.out.println("Queue kosong");
        }
    }

    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: \n" + data[rear]);
        }else{
            System.out.println("Queue kosong");
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue kosong");
        }else{
            int i = front;
            System.out.println("----------------");
            while (i != rear){
                System.out.print(data[i] + "\n");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");            
            System.out.println("Jumlah elemen: " + size);
            System.out.println("----------------");
        }
    }

    public void clear(){
        front = rear = - 1;
        size = 0;
    }
    
    public void enqueue (Pasien dt){
        if (isFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if (isEmpty()){
                front = rear = 0;
            }else if(rear == max - 1){
                rear = 0;
            }else{
                rear = rear + 1;
            }
            data [rear] = dt;
            size++;
        }
    }

    public Pasien dequeue (){
        Pasien temp = null;

        if (isEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            temp = data[front];
            size--;

            if (isEmpty()){
                front = rear = - 1;
            }else if (front == max -1){
                front = 0;
            }else{
                front++;
            }
        }
        return temp;
    }

    public void sequentialSearch(String searchNama){
        int indeks = front;
        int antrian = 1;
        if (isEmpty()){
            System.out.println("Queue Kosong");
        }else{
            boolean found = false;
            while (!found){
                if (data[indeks].nama.equalsIgnoreCase(searchNama)){
                    System.out.println(data[indeks]);
                    System.out.println("Ada pada antrian ke-" + antrian);
                    System.out.println("-----------------");
                    found = true;
                }else if (indeks == max - 1){
                    indeks = 0;
                }else if (indeks == rear && !(data[indeks].nama.equalsIgnoreCase(searchNama))){
                    System.out.println("!!!Data Tidak Ditemukan!!!");
                    found = true;
                }else{
                    indeks++;
                    antrian++;
                }
            }
        }
    }
}