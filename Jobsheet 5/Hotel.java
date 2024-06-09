public class Hotel {
    public String nama;
    public int harga;
    public double rating;

    public Hotel(String nama,int harga,double rating){
        this.nama=nama;
        this.harga=harga;
        this.rating=rating;
    }
    public void displayInfo(){
        System.out.println(nama+" (Harga: " + harga+" Rating: " + rating + ")");
    }
}
