/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author LEON
 */
public class Kubus extends Bangun_Ruang {
    float s;
     @Override
    float Volume(){
        float Volume = s*s*s;
        System.out.println("Volume Kubus: " + Volume);
        return Volume;
    }
    }

