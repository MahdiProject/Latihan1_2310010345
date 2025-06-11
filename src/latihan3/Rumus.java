package latihan3;

public class Rumus {
    //Muhammd Mahdi, 2310010345, 4D
    private double sisi,panjang,lebar,hasil;
    
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
    
    public double setLuasPersegi(){
        return sisi * sisi;
    }
    
    public double setLuasPersegiPanjang(){
        return panjang * lebar;
    }
}
