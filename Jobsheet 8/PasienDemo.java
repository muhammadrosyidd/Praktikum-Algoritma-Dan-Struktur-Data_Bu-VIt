import java.util.Scanner;
public class PasienDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas antrian pasien");
        int kapasitas = sc.nextInt();
        int menu;

        QueuePasien myQueue = new QueuePasien(kapasitas);
        do{
            System.out.println("Masukkan operasi yang diinginkan");
            System.out.println("1. Enqueue Pasien\n2. Dequeue Pasien\n3. Print\n4. Cek antrian paling depan\n5. Cek antrian paling belakang\n6. Clear\n7. Search antrian berdasarkan nama"+
            "\n8. Exit\n----------------------------");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan ID Pasien: ");
                    String noID = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin Pasien: ");
                    String jenisKelamin = sc.nextLine();

                    Pasien pasien = new Pasien(nama, noID, jenisKelamin);
                    myQueue.enqueue(pasien);
                    break;
                case 2:
                    Pasien deletedData = myQueue.dequeue();
                    if (deletedData != null){
                        System.out.println("Data yang dikeluarkan: \n" + deletedData);
                    }
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peekFront();
                    break;
                case 6:
                    myQueue.clear();
                    break;
                case 5:
                    myQueue.peekRear();
                    break;
                case 7:
                    System.out.println("Masukkan nama yang akan di cari: ");
                    sc.nextLine();
                    String namaSearch = sc.nextLine();
                    myQueue.sequentialSearch(namaSearch);
                    
            }
        }while (menu >= 1 && menu <= 7);
        sc.close();
    }
}