import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //Zad1
        /*Produkt produkt = new Produkt("Masne Maslo", 10, 5);
        produkt.WyswietlInformacje();
        produkt.DodajDoMagazynu(10);
        produkt.WyswietlInformacje();
        produkt.UsunZMagazynu(3);
        produkt.WyswietlInformacje();*/


        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        koszyk.dodajProdukt(produkt3);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        koszyk.obliczCalkowitaWartosc();*/


        //Zad3
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();

        Zamowienie zamowienie = new Zamowienie(koszyk, "Wyslane");
        zamowienie.wyswietlZamowienie();
        System.out.println();
        zamowienie.ustawStatusZamowienia("Dostarczone");
        zamowienie.wyswietlZamowienie();*/


        //Zad4
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        Zamowienie zamowienie = new Zamowienie(koszyk, "Dostarczone");
        zamowienie.wyswietlZamowienie();
        System.out.println();

        ArrayList<Zamowienie> listaZamowien = new ArrayList<>();
        listaZamowien.add(zamowienie);
        listaZamowien.add(zamowienie);
        Klient klient = new Klient("Tomek", "Dzialowy", listaZamowien);

        klient.wyswietlHistorieZamowien();
        klient.obliczLacznyKosztDostawyZamowien();*/


        //Zad5
        /*Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        Sklep sklep = new Sklep(produkty);
        sklep.wyswietlOferty();
        System.out.println();

        sklep.dodajProdukt(produkt1);
        sklep.wyswietlOferty();
        Produkt produkt = sklep.wyszukajProdukt("Chaderskie Chipsy");
        System.out.println();

        sklep.zakupy(produkt, 10);
        sklep.wyswietlOferty();*/


        //Zad6
        Produkt produkt1 = new Produkt("Masne Maslo", 5, 3);
        Produkt produkt2 = new Produkt("Lizak Mewing", 40, 1);
        Produkt produkt3 = new Produkt("Chaderskie Chipsy", 8, 20);

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);

        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);

        Platnosc platnosc = new Platnosc(10, "Nie zaplacone");
        platnosc.zaplac();

        Zamowienie zamowienie = new Zamowienie(koszyk, "Dostarczone", platnosc);
        zamowienie.wyswietlZamowienie();
        System.out.println();
        zamowienie.finalizujZamowienie();
        zamowienie.zwrocProdukt(produkt3, 10);
        zamowienie.wyswietlZamowienie();


    }
}