public class Kendaraan {
    public String noPlat;
    public String noKartu;
    public double saldo;

    public Kendaraan (String noPlat, String noKartu, double saldo){
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo = saldo;
    }

    public String toString(){
        return ("-----------------\nNo Plat: " + noPlat + "\nNo Kartu: " + noKartu +
         "\nSaldo: " + saldo +"\n-----------------");
    }
}