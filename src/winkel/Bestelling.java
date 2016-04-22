package winkel;

import java.util.ArrayList;

public class Bestelling 
{
    private ArrayList<Artikel> lijst;
    
    public Bestelling()
    {
        lijst = new ArrayList<Artikel>();
    }
    
    public void voegtoe(Artikel artikel)
    {
        lijst.add(artikel);
    }
    
    public double berekenTotaal()
    {
        double totaal = 0;
        
        for(Artikel a : lijst)
        {
            totaal = totaal + a.getPrijs();
        }
        
        return totaal;
    }
    
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        
        for(Artikel artikel : lijst)
        {
            buffer.append(artikel);
            buffer.append("\n");
        }
        
        buffer.append("Totaalbedrag: ");
        buffer.append(this.berekenTotaal());
        return buffer.toString();
    }
    
    public void printFactuur()
    {
        System.out.printf("%nFactuur%n");
        
        for(Artikel artikel : lijst)
        {
            System.out.println(artikel);
        }
        
        System.out.printf("%-26s € %6.2f%n", "Totaal", berekenTotaal());
        
        System.out.println("_______________________________________");
    }
}