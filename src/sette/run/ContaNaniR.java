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
public class ContaNaniR implements Runnable{
    private String name;

    public ContaNaniR(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    @Override
    public void run() {
        for(int i=0; i<7; i++){
    System.out.println((i+1)+" "+getName());
    }
    }
    }
    
    

