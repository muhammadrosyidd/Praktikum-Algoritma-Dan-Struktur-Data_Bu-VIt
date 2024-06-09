public class Mahasiswa {
    public String Nama;
    public String NIM;
    public String JK;
    public double IPK;

    public void tampil(int i){
            System.out.println("Mahasiswa Ke-"+(i+1));
            System.out.println("Nama : "+Nama);
            System.out.println("NIM : "+NIM);
            System.out.println("Jenis Kelamin : "+JK);
            System.out.println("Nilai IPK : "+IPK);
    }
}
