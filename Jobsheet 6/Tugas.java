public class Tugas {
    public static int sequentialByNama(String[] arr, String key) {
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(key.toLowerCase())) {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }

    public static int binarySearchByUmur(int[] arr, int key) {
        if (arr.length == 0) {
            return -1; // Larik kosong, data tidak ditemukan
        }

        boolean ascending = arr[0] < arr[arr.length - 1]; // Cek apakah urutan menaik atau menurun

        if (ascending) {
            System.out.println("Pencarian menggunakan metode Binary Search Ascending.");
            return binarySearchAsc(arr, key);
        } else {
            System.out.println("Pencarian menggunakan metode Binary Search Descending.");
            return binarySearchDesc(arr, key);
        }
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid; // Data ditemukan
            } else if (arr[mid] < key) {
                start = mid + 1; // Cari ke kanan
            } else {
                end = mid - 1; // Cari ke kiri
            }
        }
        return -1; // Data tidak ditemukan
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid; // Data ditemukan
            } else if (arr[mid] > key) {
                start = mid + 1; // Cari ke kanan
            } else {
                end = mid - 1; // Cari ke kiri
            }
        }
        return -1; // Data tidak ditemukan
    }

    public static void main(String[] args) {
        String[] Mahasiswa = {"Rosyid", "Bagas", "Alka", "Haikal", "Kemal"};
        int[] Umur = {20, 19, 18, 17, 16};

        String keyNama = "rosyid";
        int keyUmur = 20;

        int result = sequentialByNama(Mahasiswa, keyNama);
        int hasil = binarySearchByUmur(Umur, keyUmur);

        if (result != -1) {
            System.out.println("Mahasiswa dengan nama " + keyNama + " berada di index " + result);
        } else {
            System.out.println("Mahasiswa dengan nama " + keyNama + " tidak ditemukan");
        }

        if (hasil != -1) {
            System.out.println("Mahasiswa dengan umur " + keyUmur + " berada di index " + hasil);
        } else {
            System.out.println("Mahasiswa dengan umur " + keyUmur + " tidak ditemukan");
        }
    }
}
