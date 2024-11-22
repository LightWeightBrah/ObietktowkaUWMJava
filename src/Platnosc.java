public class Platnosc
{
    public int kwota;
    public String statusPlatnosci;

    public Platnosc(int kwota, String statusPlatnosci)
    {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac()
    {
        this.statusPlatnosci = "Oplacone";
        this.kwota = 0;
    }
}
