package latihan3;

public class Rumus {
    //Muhammd Mahdi, 2310010345, 4D
    private double sisi,panjang,lebar,hasil;

    Rumus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getHasil(){
        return hasil;
    }
    
    //membuat construktor
    public Rumus(double sisi, double panjang, double lebar, double hasil){
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = hasil;
    }
    
    public void hitungLuasPersegi(int sisiInput){
        sisi = sisiInput;
        hasil= sisi * sisi;
    }
    
    public void hitungLuasPersegiPanjang(int panjang, int lebar){
        panjang = panjang;
        lebar = lebar;
        hasil = panjang * lebar;
    }

    void hitungLuasPersegiPanjang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
