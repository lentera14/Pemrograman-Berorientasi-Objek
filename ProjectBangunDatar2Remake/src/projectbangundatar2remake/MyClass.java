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
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Persegi Panjang");
        PersegiPanjang a = new PersegiPanjang(10, 5);
        a.outputLuas();
        a.outputKeliling();
        
        PersegiPanjang b = new PersegiPanjang(3.6, 8);
        b.outputLuas();
        b.outputKeliling();
        
        PersegiPanjang c = new PersegiPanjang(6, 8.3);
        c.outputLuas();
        c.outputKeliling();
        
        PersegiPanjang d = new PersegiPanjang(5.6, 8.8);
        d.outputLuas();
        d.outputKeliling();
        
        System.out.println("");
        
        System.out.println("Persegi");
        Persegi e = new Persegi(4.5);
        e.outputLuas();
        e.outputKeliling();
        
        Persegi f = new Persegi(7);
        f.outputLuas();
        f.outputKeliling();
        
        System.out.println("");
        
        System.out.println("Lingkaran");
        Lingkaran g = new Lingkaran(5);
        g.outputLuas();
        g.outputKeliling();
        
        Lingkaran h = new Lingkaran(7.4);
        h.outputLuas();
        h.outputKeliling();
        
        System.out.println("");
        
        System.out.println("Segitiga");
        Segitiga i = new Segitiga(8, 10);
        i.outputLuas();
        
        Segitiga j = new Segitiga(8, 11.5);
        j.outputLuas();
        
        Segitiga k = new Segitiga(12.2, 9);
        k.outputLuas();
        
        Segitiga l = new Segitiga(13.9, 20.7);
        l.outputLuas();
    }
    
}
