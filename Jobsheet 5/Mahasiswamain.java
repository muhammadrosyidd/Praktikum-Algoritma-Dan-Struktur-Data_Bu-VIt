public class Mahasiswamain {
    public static void main(String[] args) {
        Kelas kelas1A = new Kelas(5);
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);
        
        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);
        
        System.out.println("Data sebelum diurutkan:");
        kelas1A.displayInfo();
        
        System.out.println("\nData setelah diurutkan dengan Bubble Sort berdasarkan IPK:");
        kelas1A.bubleSortByIPK();
        kelas1A.displayInfo();
        
        System.out.println("\nData setelah diurutkan dengan Selection Sort berdasarkan Umur:");
        kelas1A.selectionSortByUmur();
        kelas1A.displayInfo();
        
        System.out.println("\nData setelah diurutkan dengan Insertion Sort berdasarkan IPK secara descending:");
        kelas1A.insertionSortByIPKDesc();
        kelas1A.displayInfo();
    }
}
