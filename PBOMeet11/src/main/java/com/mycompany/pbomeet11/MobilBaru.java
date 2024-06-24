/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbomeet11;

/**
 *
 * @author A-27
 */
public class MobilBaru extends MOBIL {
    private String garansi;

    public MobilBaru(String garansi, String merek, String model) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }    
    
    @Override
    public void info() {
        super.info();
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi: " + garansi + ")");
       
    }
    
    
}
