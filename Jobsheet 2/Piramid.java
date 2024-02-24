public class Piramid {
    double alas;
    double tinggi;
    double LuasAlas;
    double Volume;
    public void hitungLuasAlas(double alas){
    LuasAlas=alas*alas;
    }
    public void Hitung_volume(double alas,double tinggi){
    Volume=(1.0/3.0)*alas*alas*tinggi;
    }
    public void cetakInfo(){
        System.out.println("Luas alasnya adalah : "+LuasAlas);
        System.out.println("Volume Piramid adalah : "+Volume);
    }
}
