/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun_ruang;


public class Bangun_Ruang {
  float Volume(){
        System.out.println("Menghitung volume bangun ruang");
        return 0;
    }
    public static void main(String[] args) {
               
    System.out.println("Menghitung laus bangun ruang");
        
        // membuat objek bangun ruang
        Bangun_Ruang BangunRuang = new Bangun_Ruang();
        
        // membuat objek Bola
        Bola Bola = new Bola();
        Bola.r = 28;
        Bola.pi = 22/7;
        
        // membuat objek Kubus
        Kubus Kubus = new Kubus();
        Kubus.s = 25;
        
        // membuat objek Limas
        Limas Limas = new Limas();
        Limas.Lalas = 70;
        Limas.tinggi = 35;
        
        // membuat objek Tabung
        Tabung Tabung = new Tabung();
        Tabung.pi = 22/7;
        Tabung.r = 7;
        Tabung.tinggi = 21;
        
        
        // memanggil method volume
        BangunRuang.Volume();
        Bola.Volume();
        Kubus.Volume();
        Limas.Volume();
        Tabung.Volume();
    }
}
    
    
  

