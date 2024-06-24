package com.mycompany.pbomeet11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-27
 */
public class MOBIL implements Kendaraan{
    
    private String merek;
    private String model;

    public MOBIL(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
   
    @Override
    public void info() {
        
        System.out.println("Ini adalah kelas Mobil");
  
}

    }



