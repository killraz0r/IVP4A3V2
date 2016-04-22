package winkel;

public class Artikel 
{
    private int nummer;
    private String omschrijving;
    private double prijs;
    
    public Artikel(int nummer, String omschrijving, double prijs)
    {
        this.nummer = nummer;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }
    
    public int getNummer()
    {
        return nummer;
    }
    
    public String toString()
    {
        return nummer + ", " + omschrijving + ", " + prijs;
    }
    
    public double getPrijs()
    {
        return prijs;
    }
}
