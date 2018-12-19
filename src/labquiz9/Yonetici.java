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
public class Yonetici extends Calisan{
    int bonus=0;
    Yonetici(String name,int maas)
    { super(name,maas); 
    }
    void setBonus(int bns)
    { bonus=bns;
    }
    int getBonus()
    {return bonus;}
    @Override
    int getMaas()
    {return (bonus+maas);
    }
    
}
