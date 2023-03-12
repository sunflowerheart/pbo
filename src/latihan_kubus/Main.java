/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_kubus;

/**
 *
 * @author yafiaryamaulana
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        Latihan_Kubus kotak = new Latihan_Kubus(5);
        kotak.ComputeAndSetVolume();
        System.out.print("Kubus dengan sisi "+kotak.sisi+ "adalah "+kotak.getVolume());
    }
    
}
