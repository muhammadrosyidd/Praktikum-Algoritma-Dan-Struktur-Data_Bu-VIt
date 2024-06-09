public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;

    public Kelas(int kuota) {
        daftarMahasiswa = new Mahasiswa[kuota];
    }

    public void add(Mahasiswa mahasiswa) {
        if (index < daftarMahasiswa.length) {
            daftarMahasiswa[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void displayInfo() {
        for (int i = 0; i < index; i++) {
            System.out.println("Index: " + i);
            daftarMahasiswa[i].displayInfo();
        }
    }

    public void bubleSortByIPK() {
        int n = daftarMahasiswa.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk) {
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j + 1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur() {
        int n = index;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur) {
                    minIndex = j;
                }
            }
            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
    }

    public int sequentialSearchByNama(String keyNama) {
        for (int i = 0; i < index; i++) {
            if (daftarMahasiswa[i] != null && daftarMahasiswa[i].nama.toLowerCase().contains(keyNama.toLowerCase())) {
                return i; 
            }
        }
        return -1; // Jika tidak ditemukan
    }

    public int binarySearchByUmur(int keyUmur) {
        int left = 0;
        int right = index - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (daftarMahasiswa[mid].umur == keyUmur) {
                return mid; // Data ditemukan
            } else if (daftarMahasiswa[mid].umur < keyUmur) {
                left = mid + 1; // Cari di sebelah kanan
            } else {
                right = mid - 1; // Cari di sebelah kiri
            }
        }
        return -1; // Jika tidak ditemukan
    }

    public static void main(String[] args) {
        Kelas kelas = new Kelas(5); 

        
        kelas.add(new Mahasiswa("Rosyid", 20, 3.75));
        kelas.add(new Mahasiswa("Bagas", 19, 3.85));
        kelas.add(new Mahasiswa("Alka", 18, 3.65));
        kelas.add(new Mahasiswa("Haikal", 17, 3.80));
        kelas.add(new Mahasiswa("Kemal", 16, 3.70));

        
        String keyNama = "rosyid";
        int resultNama = kelas.sequentialSearchByNama(keyNama);
        if (resultNama != -1) {
            System.out.println("Mahasiswa dengan nama "+keyNama+" ditemukan pada indeks " + resultNama);
            System.out.println("Detail mahasiswa:");
            kelas.daftarMahasiswa[resultNama].displayInfo();
        } else {
            System.out.println("Mahasiswa dengan nama "+keyNama+" tidak ditemukan");
        }

        
        kelas.selectionSortByUmur(); 
        int keyUmur = 18;
        int resultUmur = kelas.binarySearchByUmur(keyUmur);
        if (resultUmur != -1) {
            System.out.println("Mahasiswa dengan umur "+keyUmur+" ditemukan pada indeks " + resultUmur);
            System.out.println("Detail mahasiswa:");
            kelas.daftarMahasiswa[resultUmur].displayInfo();
        } else {
            System.out.println("Mahasiswa dengan umur "+keyUmur+" tidak ditemukan");
        }
    }
}
