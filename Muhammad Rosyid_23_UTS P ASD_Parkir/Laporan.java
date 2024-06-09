public class Laporan {
    public static void tampilkanLaporan(Kendaraan[] dataParkir, int jumlahData) {
        int totalPendapatanMobil = 0;
        int totalPendapatanMotor = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (dataParkir[i].tipe.equalsIgnoreCase("mobil")) {
                totalPendapatanMobil += dataParkir[i].hitungBiaya();
            } else if (dataParkir[i].tipe.equalsIgnoreCase("motor")) {
                totalPendapatanMotor += dataParkir[i].hitungBiaya();
            }
        }

        System.out.println("Laporan Total Pendapatan:");
        System.out.println("Total Pendapatan Mobil: " + totalPendapatanMobil + " Rupiah");
        System.out.println("Total Pendapatan Motor: " + totalPendapatanMotor + " Rupiah");
    }

}
