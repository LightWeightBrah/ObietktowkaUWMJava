import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Zes5Zad2();
    }

    public static void Zes5Zad2()
    {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);

        System.out.println(array.get(4));
        System.out.println(array.size());
    }

    public static void Zes5Zad1()
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);

        arr2.add(3);
        arr2.add(4);
        append(arr1, arr2);

        System.out.println(arr1);

    }

    public static void append(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        array1.addAll(array2);
    }

    public static void Zes4Zad2()
    {
        //int[] array = new int[10];
        int[] array = {3, 42, 1 ,5, 145, 44, 23, 4,5, 4};

        Zes4Zad2Pomoc(array, 2, 5);
    }

    public static void Zes4Zad2Pomoc(int[] arrray, int n, int m)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arrray[i * m + j] + " ");
            }
            System.out.println();
        }

    }

    public static void Zes4Zad1()
    {
        Zes4Zad1Pomoc(10, 3, 12);
    }

    public static void Zes4Zad1Pomoc(int n, int min, int max)
    {
        int[] array = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            array[i] = random.nextInt(max - min) + min;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void Zes2Zad5()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();
        System.out.println(String.format("Podales liczbe %d", number));
        System.out.println(String.format("Liczba %d powiekszona o 140 to %d", number, number+140));
        System.out.println(String.format("Liczba %d pomnniejszona o 31 to %d", number, number-31));
        System.out.println(String.format("Liczba %d powiekszona 7 razy to %d", number, number*7));
        System.out.println(String.format("Liczba %d pomniejszona 13 razy to %d", number, number/13));
        System.out.println(String.format("Liczba %d modulo 7 to %d", number, number%7));
        System.out.println(String.format("Liczba %d czesc calkowita z dzielenia przez 4 to %d", number, number/4));
        System.out.println(String.format("Liczba %d podniesiona do potegi 45 to %.0f", number, Math.pow(number, 45)));
        System.out.println(String.format("Liczba %d iloraz bitowy z 67 to %d", number, number&67));
        System.out.println(String.format("Liczba %d suma bitowa z 59 to %d", number, number|59));
        System.out.println(String.format("Liczba %d xor z 23 to %d", number, number^23));
        System.out.println(String.format("Liczba %d przesunieta o 5 bitow w lewo to %d", number, number<<5));
        System.out.println(String.format("Liczba %d przesunieta o 6 bitow w prawo to %d", number, number>>6));

        scanner.close();
    }

    public static void Zes2Zad4()
    {
        Zes2Zad4Pomoc(2, 5);
    }

    public static void Zes2Zad4Pomoc(int a, int b)
    {
        String suma = String.format("Suma liczby %d oraz %d wynosi %d", a, b, a+b);
        System.out.println(suma);
        String roznica = String.format("Roznica liczb %d oraz %d wynosi %d", a, b, a-b);
        System.out.println(roznica);
        String iloczyn = String.format("Iloczyn liczb %d oraz %d wynosi %d", a, b, a*b);
        System.out.println(iloczyn);
        String iloraz = String.format("Iloraz liczb %d oraz %d wynosi %d", a, b, a/b);
        System.out.println(iloraz);
    }

    public static void Zes2Zad3()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz slowo1");
        String slowo1 = scanner.nextLine();
        System.out.println("Wpisz slowo2");
        String slowo2 = scanner.nextLine();

        System.out.println("Podane slowo1: " + slowo1);
        System.out.println("Podane slowo2: " + slowo2);

        scanner.close();

    }

    public static void Zes2Zad2()
    {
        int wynik = (int)((Math.sqrt(7) - 1) / 2 + Math.pow(3, 3) % 2);
        System.out.println(wynik);

        int wynik2 = (int)(3423 / (26 * 5));
        System.out.println(wynik2);

        int wynik3 = (int)((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3) + 1);
        System.out.println(wynik3);

        int wynik4 = 2%3%5;
        System.out.println(wynik4);
    }

    public static void Zes2Zad1()
    {
        System.out.println(23.0 + 76);
        System.out.println(41 * 2.0 + 3);
        System.out.println(5-33);
        System.out.println(109%3);
        System.out.println(50/2);
        System.out.println(4|2);
        System.out.println(3^5);
        System.out.println(7&9);
    }

    public static void Zes1Zad12()
    {
        System.out.println("Dzisiiaj jest 5-32-555 godzina 22-33-12");
    }

    public static void Zes1Zad11()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.print("wodrze ");
        }
    }

    public static void Zes1Zad10()
    {
        String zdanie = "… to najlepsza książka napisana przez …";

        zdanie = zdanie.replaceFirst("…", "Cant hurt me");
        zdanie = zdanie.replaceFirst("…", "Davida Gogginsa");

        System.out.println(zdanie);
    }

    public static void Zes1Zad9()
    {
        String zdanie = "Grzesiek nie wiedział dlaczego ... jest tak " +
                "drapieżnym ... mimo, że jego ... na to nie wskazuje.";

        zdanie = zdanie.replaceFirst("\\.\\.\\.", "essa");
        zdanie = zdanie.replaceFirst("\\.\\.\\.", "hossa");
        zdanie = zdanie.replaceFirst("\\.\\.\\.", "bessa");

        System.out.println(zdanie);
    }

    public static void Zes1Zad8()
    {

    }

    public static void Zes1Zad7()
    {
        int a = 'A';
        int exclamationMark = '!';
        int monke = '@';
        int lower = '>';
        int op = '~';
        int slesz = '\n';
        int slb = '\b';

        System.out.println("Znak A ma kod ASCII: " + a);
        System.out.println("Znak ! ma kod ASCII: " + exclamationMark);
        System.out.println("Znak @ ma kod ASCII: " + monke);
        System.out.println("Znak > ma kod ASCII: " + lower);
        System.out.println("Znak ~ ma kod ASCII: " + op);
        System.out.println("Znak /n ma kod ASCII: " + slesz);
        System.out.println("Znak /b ma kod ASCII: " + slb);
    }

    public static void Zes1Zad6()
    {
        String zdanie = "Ala ma kota";
        String wielkie = zdanie.toUpperCase();
        String male = zdanie.toLowerCase();

        System.out.println(wielkie);
        System.out.println(male);
    }

    public static void Zes1Zad5()
    {
        String alaMaKota = "Ala ma kota";
        String alaMaKotaOut = "";
        for(int i = 0; i < alaMaKota.length(); i++)
        {
            char current = alaMaKota.charAt(i);
            if(current == 'A' || current == 'a')
            {
                current = 'e';
            }
            alaMaKotaOut += current;
        }

        System.out.println(alaMaKotaOut);
    }

    public static void Zes1Zad4()
    {
        String arrow =
                "                *\n" +
                "                **\n" +
                "                ***\n" +
                "********************\n" +
                "*********************\n" +
                "********************\n" +
                "                ***\n" +
                "                **\n" +
                "                *\n";

        String diamond = "" +
                "     *   \n" +
                "    * *   \n" +
                "   * * *   \n" +
                "  * * * *   \n" +
                " * * * * *   \n" +
                "* * * * * *   \n" +
                " * * * * *   \n" +
                "  * * * *   \n" +
                "   * * *   \n" +
                "    * *   \n" +
                "     *   \n";

        System.out.println(arrow);
        System.out.println(diamond);
    }

    public static void Zes1Zad3()
    {
        String ala = "Ala";
        String ma = " ma ";
        String kota = "kota";

        System.out.println(ala+ma+kota);
    }

    public static void Zes1Zad2()
    {
        String napis = "Jul Essa";
        int dlugosc = napis.length();
        System.out.println(dlugosc);
    }

    public static void Zes1Zad1()
    {
        System.out.println("Jul Essa");
    }
}