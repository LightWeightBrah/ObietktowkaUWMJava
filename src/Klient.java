import java.util.ArrayList;

public class Klient
{
    public String imie;
    public String nazwisko;
    public ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }

    public void dodajZamowienie(Zamowienie noweZamowienie)
    {
        this.listaZamowien.add(noweZamowienie);
    }

    public void wyswietlHistorieZamowien()
    {
        for(int i = 0; i < listaZamowien.size(); i++)
        {
            System.out.println(String.format("Zamowienie nr %d", i + 1));
            Zamowienie zamowienie = listaZamowien.get(i);
            zamowienie.wyswietlZamowienie();
            System.out.println();
        }
    }

    public void obliczLacznyKosztDostawyZamowien()
    {
        int sum = 0;
        for(int i = 0; i < listaZamowien.size(); i++)
        {
            Zamowienie zamowienie = listaZamowien.get(i);
            for(int j = 0; j < zamowienie.koszykZakupowy.listaProdukt.size(); j++)
            {
                Produkt produkt = zamowienie.koszykZakupowy.listaProdukt.get(j);
                sum += produkt.cena;
            }
        }

        System.out.println(String.format("Laczny koszt dostawy zamowien: %d", sum));
    }
}
