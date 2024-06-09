class Kendaraan {
    String tipe;
    String platNomor;
    int durasiParkir;
    int total;

    public Kendaraan(String tipe, String platNomor, int durasiParkir) {
        this.tipe = tipe;
        this.platNomor = platNomor;
        this.durasiParkir = durasiParkir;
        this.total = hitungBiaya(); // Menghitung biaya saat objek Kendaraan dibuat
    }

    public int hitungBiaya() {
        // Hitung biaya parkir berdasarkan durasi parkir dan tipe kendaraan
        int tarifPerJam = (tipe.equalsIgnoreCase("mobil")) ? 3000 : 2000;
        return tarifPerJam * durasiParkir;
    }

    public String Display() {
        return "Tipe Kendaraan: " + tipe + ", Plat Nomor: " + platNomor + ", Durasi Parkir: " + durasiParkir + " jam, Biaya: " + total;
    }
}
