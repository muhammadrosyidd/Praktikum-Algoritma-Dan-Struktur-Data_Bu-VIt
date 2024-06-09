import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int jmlh=input.nextInt();
        Mahasiswa[] Mahasiswas = new Mahasiswa[jmlh];

        for(int i=0; i<jmlh;i++){
            Mahasiswas[i]=new Mahasiswa();

            System.out.println("Mahasiswa Ke-"+(i+1));
            System.out.println("Masukkan Nama:");
            Mahasiswas[i].Nama=input.next();
            System.out.println("Masukkan NIM:");
            Mahasiswas[i].NIM=input.next();
            System.out.println("Masukkan Jenis Kelamin (P/L):");
            Mahasiswas[i].JK=input.next();
            System.out.println("Masukkan Nilai IPK:");
            Mahasiswas[i].IPK=input.nextDouble();
            input.nextLine();
        }

        double totalIPK = 0;
        for (int i = 0; i < jmlh; i++) {
            totalIPK += Mahasiswas[i].IPK;
        }
        double rataRataIPK = totalIPK / jmlh;

        for(Mahasiswa Tampil : Mahasiswas){
            Tampil.tampil(j);
            j++;
        }
        System.out.printf("Rata-Rata IPK : %.2f",rataRataIPK);
    }
}
