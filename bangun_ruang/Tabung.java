/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang;

/**
 *
 * @author LEON
 */
public class Tabung extends Bangun_Ruang{
    float pi;
    float r;
    float tinggi;
     @Override
    float Volume(){
        float Volume = pi*r*r*tinggi;
        System.out.println("Volume Tabung: " + Volume);
        return Volume;
    }
}