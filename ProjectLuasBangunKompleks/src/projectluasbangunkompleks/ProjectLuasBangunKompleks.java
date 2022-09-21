/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Diba
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Project 01 
        //membuat objek persegi 
            Persegi p = new Persegi();
        //membuat object lingkaran 
            Lingkaran l = new Lingkaran();
        //hitung luas persegi 
            int persegi = p.hitungLuas(42);
        //hitung luas lingkaran
            double lingkaran = l.hitungLuas(21);
        //hitung luas keseluruhan
            double total = (int) persegi + lingkaran;
        System.out.println("Total Luas Bangun Datar = " + total);
        System.out.println("");
        
        //Project 02
        //menghitung luas lingkaran besar
            double lingkaranBesar = l.hitungLuas2(14);
        //menghitung luas lingkaran kecil
            double lingkaranKecil1 = l.hitungLuas2(7);
            double lingkaranKecil2 = l.hitungLuas2(7);
        //menghitung luas keseluruhan 
            double luas = lingkaranBesar - (lingkaranKecil1 + lingkaranKecil2);
        System.out.println("Luas Daerah Berwarna Abu-Abu = " + luas);
    }
    
}
