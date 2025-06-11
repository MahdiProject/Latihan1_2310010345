package latihan3;

public class RumusBeraksi {
    public static void main(String[] args){
        Rumus mahdi = new Rumus();
        
        mahdi.hitungLuasPersegi(5);
        System.out.println("Luas Persegi: " + mahdi.getHasil());
        mahdi.hitungLuasPersegiPanjang(7);
        System.out.println("Luas Persegi Panjang: " + mahdi.getHasil());
    }
}
