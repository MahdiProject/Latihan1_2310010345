package hitung;

public class Matematika {
    //membuat vtariabel
    private double bil1, bil2;
    
    //membuat construktor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat method setPenjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
}
