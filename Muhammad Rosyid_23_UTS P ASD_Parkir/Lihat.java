public class Lihat {
    public static void lihatData(Kendaraan[] dataParkir, int jumlahData) {
        if (jumlahData == 0) {
            System.out.println("Belum ada data parkir yang dimasukkan.");
        } else {
            // Urutkan dataParkir secara descending berdasarkan biaya (selection sort)
            for (int i = 0; i < jumlahData - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < jumlahData; j++) {
                    if (dataParkir[j].total > dataParkir[maxIndex].total) {
                        maxIndex = j;
                    }
                }
                // Tukar elemen
                Kendaraan temp = dataParkir[maxIndex];
                dataParkir[maxIndex] = dataParkir[i];
                dataParkir[i] = temp;
            }

            System.out.println("Data Parkir (Urut berdasarkan biaya):");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + dataParkir[i].Display());
            }
        }
    }
}
