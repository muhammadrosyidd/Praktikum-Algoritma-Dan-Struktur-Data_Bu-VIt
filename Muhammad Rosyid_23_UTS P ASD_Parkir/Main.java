import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data dan hitung total biaya");
            System.out.println("2. Cari data berdasarkan nomor plat");
            System.out.println("3. Lihat data urut secara descending berdasarkan biaya");
            System.out.println("4. Laporan total pendapatan berdasarkan tipe kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    InputData.inputData(input);
                    break;
                case 2:
                    Cari.cariData(input, InputData.dataParkir, InputData.jumlahData);
                    break;
                case 3:
                    Lihat.lihatData(InputData.dataParkir, InputData.jumlahData);
                    break;
                case 4:
                    Laporan.tampilkanLaporan(InputData.dataParkir, InputData.jumlahData);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 5);

        input.close();
    }
}
