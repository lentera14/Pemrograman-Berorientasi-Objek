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
public class Lingkaran {
    double hitungLuas(int r){
        double luasLingkaran;
        luasLingkaran = ((3.14 * r * r) * 2);
        System.out.println("Luas Seluruh Lingkaran = " + luasLingkaran);
        return luasLingkaran;
    }
    
    double hitungLuas2(int r){
        double luasLingkaran2;
        luasLingkaran2 = ((3.14 * r * r) / 2);
        System.out.println("Luas Lingkaran = " + luasLingkaran2);
        return luasLingkaran2;
    }
}