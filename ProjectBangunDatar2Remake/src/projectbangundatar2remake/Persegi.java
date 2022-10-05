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
public class Persegi {
    double s;
    
    Persegi(double a){
        this.s = a;
    }
    
    void outputLuas(){
        double hasil = this.s * this.s;
        System.out.println("Luas Persegi dengan panjang " + s + " = " + hasil + " m2");
    }
    
    void outputKeliling(){
        double hasil = 4 * this.s;
        System.out.println("Keliling Persegi dengan panjang " + s + " = " + hasil + " m");
    }
}
