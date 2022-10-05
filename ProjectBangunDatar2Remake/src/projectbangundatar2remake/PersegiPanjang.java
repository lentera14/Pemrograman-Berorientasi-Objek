/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2remake;

/**
 *
 * @author Diba
 */
public class PersegiPanjang {
    double p;
    double l; 
    
    PersegiPanjang(double a, double b){
        this.p = a;
        this.l = b;
    }
     
    void outputLuas(){
        double hasil = this.p * this.l;
        System.out.println("Luas Persegi Panjang dengan panjang " + p + " dan lebar " + l + " = " + hasil + " m2");
    }
    
    void outputKeliling(){
        double hasil = (2 * this.p) + (2 * this.l);
        System.out.println("Keliling Persegi Panjang dengan panjang " + p + " dan lebar " + l + " = " + hasil + " m");
    }
}
