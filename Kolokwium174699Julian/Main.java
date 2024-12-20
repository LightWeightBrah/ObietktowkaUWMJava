import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //Zad1
        System.out.println("============Zad1=============\n");
        Elf elf = new Elf("Hubert", 22, "Starszy Elf");
        elf.przedstawSie();

        System.out.println("=============================\n");

        //Zad2
        System.out.println("============Zad2=============\n");

        ArrayList<Elf> pracownicy = new ArrayList<Elf>();
        Elf pracownik1 = new Elf("Prac1", 22, "Mlodzik Elf");
        Elf pracownik2 = new Elf("Prac2", 55, "Stary Elf");
        Elf pracownik3 = new Elf("Prac3", 24, "Mlodzik Elf");
        pracownicy.add(pracownik1);
        pracownicy.add(pracownik2);
        pracownicy.add(pracownik3);
        Fabryka fabryka = new Fabryka(pracownicy, 50, 50);

        for(int i = 0; i < fabryka.getPracownicy().size(); i++)
        {
            Elf currentElf = fabryka.getPracownicy().get(i);
            currentElf.przedstawSie();
        }

        System.out.println();
        fabryka.dodajPracownika(elf);
        fabryka.usunPracownika(pracownik1);

        for(int i = 0; i < fabryka.getPracownicy().size(); i++)
        {
            Elf currentElf = fabryka.getPracownicy().get(i);
            currentElf.przedstawSie();
        }

        Elf najstarszy = fabryka.najstarszyPracownik();
        System.out.println("Najstarszy pracownik");
        najstarszy.przedstawSie();

        System.out.println("=============================\n");

        //Zad3
        System.out.println("=============Zad3=============\n");
        Renifer rudolf = new Renifer("Rudolf", 3);
        rudolf.nakarmRenifera();
        System.out.println(String.format("Predkosc renifera po nakarmieniu to %d", rudolf.getPredkosc()));

        System.out.println("=============================\n");

        //Zad4
        System.out.println("=============Zad4=============\n");

        Renifer renifer1 = new Renifer("Renifer1", 30);
        Renifer renifer2 = new Renifer("Renifer2", 6);
        ArrayList<Renifer> renifery = new ArrayList<>();
        renifery.add(renifer1);
        renifery.add(renifer2);

        Sanie sanie = new Sanie(renifery);

        Renifer renifer3 = new Renifer("Renifer3", 50);
        sanie.dodajRenifera(renifer3);

        for(int i = 0; i < sanie.getRenifery().size(); i++)
        {
            Renifer current = sanie.getRenifery().get(i);
            System.out.println(String.format("Renifer: %s predkosc %d", current.getImie(),current.getPredkosc()));
        }

        int sumaPrekosci = sanie.sumaPredkosc();
        System.out.println(String.format("Suma predkosci to %d", sumaPrekosci));

        Renifer najwolniejszy = sanie.najwolniejszyRenifer();
        System.out.println(String.format("Najwolniejszy renifer %s predkosc %d", najwolniejszy.getImie(), najwolniejszy.getPredkosc()));

        System.out.println("=============================\n");

        //Zad5
        System.out.println("=============Zad5=============\n");

        Elf testeElf5 = new Elf("Test5", 20, "Szef");
        Elf testeElf6 = new Elf("Test5", 20, "Szef");

        System.out.println(testeElf5.toString());
        System.out.println(testeElf6.toString());

        if(testeElf5.equals(testeElf6))
        {
            System.out.println("Test Elf5 EQUALS test Elf6");
        }
        else
        {
            System.out.println("Test Elf5 TO NIE test Elf6 :c");
        }


        System.out.println("=============================\n");

        //Zad6
        System.out.println("=============Zad6=============\n");

        String pusteImie = "";

        Elf elfZad6 = new Elf("Elff", 23, "Ess");
        //Testowany exception dziala elegancko
        //elfZad6.setImie(pusteImie);

        System.out.println("=============================\n");

    }
}