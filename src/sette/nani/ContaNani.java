/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sette.nani;

/**
 *
 * @author gabbo
 */
public class ContaNani extends Thread{
    public ContaNani (String nome){
    super();
    setName(nome);
    }
    
    public void run (){
    for(int i=0; i<7; i++){
    System.out.println((i+1)+" "+getName());
    }
    }
}
