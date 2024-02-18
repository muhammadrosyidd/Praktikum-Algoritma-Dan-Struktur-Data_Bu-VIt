import java.util.Scanner;

public class PLAT_23 {
    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N','T'};

        // Array nama kota yang berpasangan dengan kode plat mobil
        String[][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kode plat mobil
        System.out.print("Masukkan kode plat mobil (hanya satu huruf besar): ");
        char inputKode = scanner.next().charAt(0);

        // Mencari nama kota berdasarkan kode plat mobil yang dimasukkan pengguna
        String namaKota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                namaKota = KOTA[i][0]; // Mengambil nama kota pertama dari array KOTA
                break;
            }
        }

        // Menampilkan hasil
        if (namaKota != null) {
            System.out.println("Nama kota untuk kode plat " + inputKode + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat mobil tidak valid atau tidak ada dalam database.");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
