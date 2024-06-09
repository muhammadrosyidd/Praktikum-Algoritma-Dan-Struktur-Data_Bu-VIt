public class Pasien{
    String nama;
    String noID;
    String jenisKelamin;

    public Pasien (String nama, String noID, String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
        this.nama = nama;
        this.noID = noID;
    }

    public String toString (){
        return ("-----------------\nNama Pasien: " + nama + "\nNo ID: " + noID +
        "\nJenis Kelamin: " + jenisKelamin +"\n-----------------");
    }
}