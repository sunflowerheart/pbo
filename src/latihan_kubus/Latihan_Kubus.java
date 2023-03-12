/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_kubus;

/**
 *
 * @author yafiaryamaulana
 */
import java.util.Scanner;
public class Latihan_Kubus {
    
       //atribut
       public int sisi;
       public int volume;
     
       //contructor
       public Latihan_Kubus(int sisi){
       this.sisi = sisi;
       }
      
       public void setSisi(int sisi) {
       this.sisi = sisi;
       }   
      
       public void ComputeAndSetVolume(){
          //compute volume
          int calculator_vol = this.sisi * this.sisi * this.sisi;
          this.volume = calculator_vol;
       }
    public int getVolume(){
        return this.volume;
    }
}
    

