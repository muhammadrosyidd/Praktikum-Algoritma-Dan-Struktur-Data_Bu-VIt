import java.util.Scanner;

public class Cari {
    public static void cariData(Scanner input, Kendaraan[] dataParkir, int jumlahData) {
        System.out.print("Masukkan plat nomor yang ingin dicari: ");
        String platNomorCari = input.next();
        boolean found = false;

        System.out.println("Mencari data dengan plat nomor: " + platNomorCari); // <-- Pencatatan

        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].platNomor.equalsIgnoreCase(platNomorCari)) {
                System.out.println("Data ditemukan:");
                System.out.println(dataParkir[i].Display());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Data dengan plat nomor " + platNomorCari + " tidak ditemukan.");
        }
    }

}
