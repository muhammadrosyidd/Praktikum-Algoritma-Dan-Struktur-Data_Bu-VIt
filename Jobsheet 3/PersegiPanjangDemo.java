import java.util.Scanner;
public class PersegiPanjangDemo{
public static void main(String []args) {
    Scanner input = new Scanner(System.in);
    int panjang, lebar;
    System.out.print("Masukkan length array : ");
    int banyak = input.nextInt();
    PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[banyak];
    for (int i = 0; i < banyak; i++) {
        System.out.println("Persegi Panjang ke-" + (i+1));
        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();  
        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
    }
    for (int i = 0; i < banyak; i++) {
    System.out.println("Persegi Panjang Ke-"+(i+1));
    arrayOfPersegiPanjang[i].cetakInfo();
    arrayOfPersegiPanjang[i].HitungLuas();
    arrayOfPersegiPanjang[i].HitungKeliling();
   }    
 }
}