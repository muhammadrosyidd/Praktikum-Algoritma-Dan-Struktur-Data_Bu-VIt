public class PersegiPanjang{
public int panjang,lebar,luas,keliling;  

public PersegiPanjang(int p, int l) {
    panjang = p;
    lebar = l;  
}

public void cetakInfo() {
    System.out.println("Panjang : " + panjang + ", lebar : " + lebar);
}
public void HitungLuas() {
    int luas = panjang*lebar;
    System.out.print("Luas = " + luas);
}
public void HitungKeliling() {
    int keliling = 2*(panjang+lebar);
    System.out.println("Keliling = " + keliling);
}
}