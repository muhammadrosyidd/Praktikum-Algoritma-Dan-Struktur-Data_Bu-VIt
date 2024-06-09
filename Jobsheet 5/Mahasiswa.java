public class Mahasiswa {
    public String nama;
    public int umur;
    public double ipk;

    public Mahasiswa(String nama,int umur,double ipk){
        this.nama=nama;
        this.umur=umur;
        this.ipk=ipk;
    }
    public void displayInfo(){
        System.out.println(nama+"(Umur: " + umur+" IPK: " + ipk + ")");
    }
    
}
