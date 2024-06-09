public class Customer{
    public int id;
    public String name;
    public Customer() {

    }

    public Customer(int id, String name){
        this.id = id;
        this.name=name;
    }

    public String toString(){
        return "ID: "+ this.id + " Nama: "+ this.name;
    }
}