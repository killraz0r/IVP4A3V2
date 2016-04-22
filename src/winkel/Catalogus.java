package winkel;

import java.util.ArrayList;

public class Catalogus 
{
    private ArrayList<Artikel> lijst;
    
    public Catalogus()
    {
        lijst = new ArrayList<Artikel>();
    }
    
    public void voegtoe(Artikel artikel)
    {
        lijst.add(artikel);
    }
    
    public void print()
    {
        System.out.println("Inhoud van de catalogus:");
        
        for(Artikel a : lijst)
        {
            System.out.println("a");
        }
    }
    
    public Artikel zoek(int nummer)
    {
        Artikel gezochteArtikel = null;
        
        for(Artikel a : lijst)
        {
            if(a.getNummer() == nummer)
            {
                gezochteArtikel = a;
            }
        }
        
        return gezochteArtikel;
    }
}
