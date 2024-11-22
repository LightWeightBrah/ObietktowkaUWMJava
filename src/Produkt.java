public class Produkt
{
    public String nazwa;
    public int cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, int cena, int iloscNaMagazynie)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void WyswietlInformacje()
    {
        System.out.println("Nazwa " + nazwa);
        System.out.println("Cena " + cena);
        System.out.println("Ilosc na magazynie " + iloscNaMagazynie);

    }

    public void DodajDoMagazynu(int ilosc)
    {
        this.iloscNaMagazynie+= ilosc;
    }

    public void UsunZMagazynu(int ilosc)
    {
        int temp = this.iloscNaMagazynie - ilosc;
        if(temp > 0)
            this.iloscNaMagazynie-=ilosc;
    }
}
