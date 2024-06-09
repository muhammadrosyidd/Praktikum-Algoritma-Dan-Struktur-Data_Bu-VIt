public class stack {
    public int size;
    public String[] data;
    public int top;
    
    public stack (int size) {
        this.size = size;
        this.data = new String[size];
        this.top = -1;
    }
    
    public boolean IsFull() {
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(String dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Stack Penuh");
        }
    }

    public String pop() {
        if (!IsEmpty()) {
            String temp = data[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }

    public void peek() {
        System.out.println("Elemen teratas stack: "+ data[top]);
    }

    public void print() {
        System.out.println("Isi stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}