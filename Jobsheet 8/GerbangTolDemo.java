import java.util.Scanner;

public class GerbangTolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue");
        int kapasitas = sc.nextInt();
        int menu;

        QueueTol myQueue = new QueueTol(kapasitas);
        do{
            System.out.println("Masukkan operasi yang diinginkan");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Cek antrian paling depan\n5. Cek antrian paling belakang\n6. Clear\n7. Exit\n----------------------------");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan no plat: ");
                    String noPlat = sc.nextLine();
                    System.out.print("Masukkan no kartu: ");
                    String noKartu = sc.nextLine();
                    System.out.print("Masukkan Saldo: ");
                    double saldo = sc.nextDouble();

                    Kendaraan kendaraan = new Kendaraan(noPlat, noKartu, saldo);
                    myQueue.enqueue(kendaraan);
                    break;
                case 2:
                    Kendaraan deletedData = myQueue.dequeue();
                    if (deletedData != null){
                        System.out.println("Data yang dikeluarkan: " + deletedData);
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
                    
            }
        }while (menu >= 1 && menu <= 6);
        sc.close();
    }
}