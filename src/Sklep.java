import java.util.ArrayList;

public class Sklep
{
    public ArrayList<Produkt> produkty = new ArrayList<Produkt>();

    public Sklep(ArrayList<Produkt> produkty)
    {
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt produktDoDodania)
    {
        this.produkty.add(produktDoDodania);
    }

    public void wyswietlOferty()
    {
        System.out.println("Skelp zawiera nastepujace produkty");

        for(int i = 0; i < produkty.size(); i++)
        {
            Produkt produkt = produkty.get(i);
            produkt.WyswietlInformacje();
        }
    }

    public Produkt wyszukajProdukt(String nazwaProduktu)
    {
        for (int i = 0; i < produkty.size(); i++)
        {
            Produkt produkt = produkty.get(i);

            if(produkt.nazwa == nazwaProduktu)
            {
                System.out.println(String.format("Znaleziono produkt %s!", produkt.nazwa));
                return produkt;
            }
        }


        System.out.println(String.format("Nie znaleziono produktu :("));
        return null;
    }

    public void zakupy(Produkt produktDoDodania, int ilosc)
    {
        produktDoDodania.iloscNaMagazynie -= ilosc;
        this.produkty.add(produktDoDodania);
    }

}
