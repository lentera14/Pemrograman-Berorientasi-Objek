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
public class Segitiga {
    double a;
    double t;
    
    Segitiga(double b, double c){
        this.a = b;
        this.t = c;
    }
    
    void outputLuas(){
        double hasil = this.a * this.t / 2;
        System.out.println("Luas Segitiga dengan alas " + a + " dan tinggi " + t + " = " + hasil + " m2");
    }
}
