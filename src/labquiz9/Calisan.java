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
public class Calisan extends Kisi{
    int maas;
    Calisan(String name,int maas)
    {
    super(name);    
    this.maas=maas;
    }
    int getMaas()
    { return maas;
    }
    void setMaas(int m)
    { maas=m;
    }
    
}
