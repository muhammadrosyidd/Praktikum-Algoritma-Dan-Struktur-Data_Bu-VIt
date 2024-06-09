import java.util.Scanner;
public class InputData {
    static final int MAX_PARKIR = 100;
    static Kendaraan[] dataParkir = new Kendaraan[MAX_PARKIR];
    static int jumlahData = 0;
    static int biaya;

    public static void inputData(Scanner input) {
        System.out.println("Memulai inputData"); // <-- Pencatatan
        if (jumlahData < MAX_PARKIR) {
            System.out.print("Masukkan tipe kendaraan (mobil/motor): ");
            String tipe = input.next();
            System.out.print("Masukkan plat nomor: ");
            String platNomor = input.next();
            System.out.print("Masukkan durasi parkir (jam): ");
            int durasiParkir = input.nextInt();

            Kendaraan kendaraan = new Kendaraan(tipe, platNomor, durasiParkir);
            dataParkir[jumlahData] = kendaraan;
            biaya = kendaraan.hitungBiaya();
            System.out.println("Biaya parkir: " + biaya + " Rupiah");
            jumlahData++;
            System.out.println("Data Berhasil Ditambahkan");
            System.out.println("=============================");
            System.out.println(kendaraan.Display());
        } else {
            System.out.println("Kapasitas parkir sudah penuh!");
        } 
    }
}
