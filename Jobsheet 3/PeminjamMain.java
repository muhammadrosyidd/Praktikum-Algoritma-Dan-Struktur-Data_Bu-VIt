import java.util.Scanner;

public class PeminjamMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Peminjam: ");
        int jmlh = input.nextInt();
        Peminjam[] peminjam = new Peminjam[jmlh];
        Peminjam  peminjam1 = new Peminjam();

        for (int i = 0; i < jmlh; i++) {
            peminjam[i] = new Peminjam();
            System.out.println("Peminjam Ke-" + (i+1));
            System.out.println("Masukkan Nama: ");
            peminjam[i].Nama = input.next();
            System.out.println("Buku Yang Dipinjam: ");
            peminjam[i].JBuku = input.next();
            System.out.println("Tanggal Pinjam: ");
            peminjam[i].tglPinjam = input.next();
        }

        for (int i = 0; i < jmlh; i++) {
            System.out.println("Peminjam Ke-" + (i+1));
            peminjam[i].cetakinfo();
        }

        for(Peminjam x:peminjam){
            x.cetakinfo();
        }
    }
}
