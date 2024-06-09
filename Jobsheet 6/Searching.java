public class Searching {
    public static int sequentialSearch(int[] arr, int key) {
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
            }
        }
        return firstIndex;
    }

    public static int binarySearch(int[] arr, int key) {
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
        int[] daftarNilai = {35, 30, 25, 20, 15, 10, 5}; // Contoh larik terurut secara descending

        int hasil = binarySearch(daftarNilai, 20);
        if (hasil != -1) {
            System.out.println("Data ditemukan pada index ke - " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
