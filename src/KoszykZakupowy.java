import java.util.ArrayList;

public class KoszykZakupowy
{
    public ArrayList<Produkt> listaProdukt = new ArrayList<Produkt>();

    public KoszykZakupowy(ArrayList<Produkt> listaProdukt)
    {
        this.listaProdukt = listaProdukt;
    }

    public void dodajProdukt(Produkt produkt)
    {
        if(produkt.iloscNaMagazynie > 0)
            listaProdukt.add(produkt);

        produkt.iloscNaMagazynie--;
    }

    public void wyswietlZawartoscKoszyka()
    {
        for(int i = 0; i < listaProdukt.size(); i++)
        {
            Produkt temp = listaProdukt.get(i);
            System.out.println(String.format("Produkt o nazwie %s cena %d ilosc %d", temp.nazwa, temp.cena, temp.iloscNaMagazynie));
        }
    }

    public void obliczCalkowitaWartosc()
    {
        int sum = 0;
        for(int i = 0; i < listaProdukt.size(); i++)
        {
            Produkt temp = listaProdukt.get(i);
            sum += temp.cena;
        }
        System.out.println(String.format("Calkowita wartosc wszystkich produktow w koszyku wynosi %d", sum));
    }
}
