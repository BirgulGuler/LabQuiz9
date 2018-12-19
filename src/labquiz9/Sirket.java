/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz9;

/**
 *
 * @author Technopc
 */
public class Sirket {
 private Calisan[] calisanlar;
 public Sirket(){
    Yonetici y1= new Yonetici("Birgül",2000);
    y1.setBonus(500);
    Calisan c1=new Calisan("Ayşe",1500);
    Calisan c2=new Calisan("Orhan",1700);
    calisanlar=new Calisan[3];
    calisanlar[0]=y1;
    calisanlar[1]=c1;
    calisanlar[2]=c2;
 }
 public void calisanlarGoster()
 {
      for(Calisan n:calisanlar)
         {System.out.println(n.getIsım()+":"+n.getMaas());}
 }
    public static void main(String[] args) {
 Sirket sirket=new Sirket();
 sirket.calisanlarGoster();
 
    }
    
}
