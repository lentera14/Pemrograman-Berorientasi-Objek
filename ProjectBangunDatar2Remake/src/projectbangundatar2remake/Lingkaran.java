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
public class Lingkaran {
    double r;
    
    Lingkaran(double a){
        this.r = a;
    }
    
    void outputLuas(){
        double hasil = 3.14 * this.r * this.r;
        System.out.println("Luas Lingkaran dengan jari-jari " + r + " = " + hasil + " m2");
    }
    
    void outputKeliling(){
        double hasil = 3.14 * (2 * this.r);
        System.out.println("Keliling Lingkaran dengan jari-jari " + r + " = " + hasil + " m");
    }
}
