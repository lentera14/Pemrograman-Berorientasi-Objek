/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Diba
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Persegi Panjang
        System.out.println("Persegi Panjang");
        PersegiPanjang a = new PersegiPanjang();
        
        System.out.println("a. panjang = 10 lebar = 5");
        System.out.println("   luas = " + a.hitungLuas(10, 5) + "; keliling = " + a.hitungKeliling(10, 5));
        System.out.println("b. panjang = 3.6 lebar = 8");
        System.out.println("   luas = " + a.hitungLuas(3.6, 8) + "; keliling = " + a.hitungKeliling(3.6, 8));
        System.out.println("c. panjang = 6 lebar = 8.3");
        System.out.println("   luas = " + a.hitungLuas(6, 8.3) + "; keliling = " + a.hitungKeliling(6, 8.3));
        System.out.println("d. panjang = 5.6 lebar = 8.8");
        System.out.println("   luas = " + a.hitungLuas(5.6, 8.8) + "; keliling = " + a.hitungKeliling(5.6, 8.8));
    
        //Persegi
        System.out.println("");
        System.out.println("Persegi");
        Persegi b = new Persegi();
        
        System.out.println("a. panjang sisi = 4.5");
        System.out.println("   luas = " + b.hitungLuas(4.5) + "; keliling = " + b.hitungKeliling(4.5));
        System.out.println("b. panjang sisi = 7");
        System.out.println("   luas = " + b.hitungLuas(7) + "; keliling = " + b.hitungKeliling(7));
    
        //Lingkaran
        System.out.println("");
        System.out.println("Lingkaran");
        Lingkaran c = new Lingkaran();
        
        System.out.println("a. jejari = 5");
        System.out.println("   luas = " + c.hitungLuas(5) + "; keliling = " + c.hitungKeliling(5));
        System.out.println("b. jejari = 7.4");
        System.out.println("   luas = " + c.hitungLuas(7.4) + "; keliling = " + c.hitungKeliling(7.4));
    
        //Segitiga
        System.out.println("");
        System.out.println("Segitiga");
        Segitiga d = new Segitiga();
        
        System.out.println("a. panjang alas = 8 tinggi = 10");
        System.out.println("   luas = " + d.hitungLuas(8, 10));
        System.out.println("b. panjang alas = 8 tinggi = 11.5");
        System.out.println("   luas = " + d.hitungLuas(8, 11.5));
        System.out.println("c. panjang alas = 12.2 tinggi = 9");
        System.out.println("   luas = " + d.hitungLuas(12.2, 9));
        System.out.println("d. panjang alas = 13.9 tinggi = 20.7");
        System.out.println("   luas = " + d.hitungLuas(13.9, 20.7));
    }
}
