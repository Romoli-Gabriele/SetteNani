/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sette.run;


/**
 *
 * @author gabbo
 */
public class SetteNaniR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r1 = new ContaNaniR("Dotto");
        Runnable r2 = new ContaNaniR("Eolo");
        Runnable r3 = new ContaNaniR("Mammolo");
        Runnable r4= new ContaNaniR("Cucciolo");
        Runnable r5 = new ContaNaniR("Brontolo");
        Runnable r6 = new ContaNaniR("Pisolo");
        Runnable r7 = new ContaNaniR("Gongolo");
        
        Thread thr1 = new Thread(r1);
        Thread thr2 = new Thread(r2);
        Thread thr3 = new Thread(r3);
        Thread thr4 = new Thread(r4);
        Thread thr5 = new Thread(r5);
        Thread thr6 = new Thread(r6);
        Thread thr7 = new Thread(r7);
        
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
    }
    
}
