package hitung;
 
public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika mahdi = new Matematika(4,5);
        System.out.println("Hasil penjumlahan: "+mahdi.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+mahdi.setPengurangan());
        System.out.println("Hasil perkalian: "+mahdi.setPerkalian());
        System.out.println("Hasil pembagian: "+mahdi.setPembagian());
    }
}
