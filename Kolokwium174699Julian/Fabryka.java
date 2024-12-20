import java.util.ArrayList;
import java.util.Objects;

public class Fabryka
{
    private ArrayList<Elf> pracownicy = new ArrayList<Elf>();
    private double dlGeo;
    private double szGeo;

    public Fabryka(ArrayList<Elf> pracownicy, int dlGeo, int szGeo)
    {
        this.setPracownicy(pracownicy);
        this.setDlGeo(dlGeo);
        this.setSzGeo(szGeo);
    }

    public ArrayList<Elf> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(ArrayList<Elf> pracownicy)
    {
        if(pracownicy.size() == 0 || pracownicy == null)
        {
            throw new NullPointerException("pracownicy is 0 or null");
        }
        else
        {
            this.pracownicy = pracownicy;
        }
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(double dlGeo)
    {
        if(dlGeo < -180 || dlGeo > 180)
        {
            throw new NullPointerException("dlGeo mniej niz -180 albo wiecej niz 180 BLAD");
        }
        else
        {
            this.dlGeo = dlGeo;
        }
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(double szGeo)
    {
        if(szGeo < -90 || szGeo > 90)
        {
            throw new NullPointerException("dlGeo mniej niz -180 albo wiecej niz 180 BLAD");
        }
        else
        {
            this.szGeo = szGeo;
        }
    }

    @Override
    public String toString()
    {
        String returnString = "Pracownicy w fabryce\n";

        for(int i = 0; i < this.pracownicy.size(); i++)
        {
            Elf elf = this.pracownicy.get(i);
            returnString += elf.toString();
        }

        returnString += String.format("\nDlugosc geo = %f\nSzerokosc geo = %f", this.dlGeo, this.szGeo);

        return returnString;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(this.getClass() != obj.getClass())
            return false;

        Fabryka fabryka = (Fabryka) obj;

        return (this.pracownicy == fabryka.pracownicy && this.dlGeo == fabryka.dlGeo && this.szGeo == fabryka.szGeo);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.pracownicy, this.dlGeo, this.szGeo);
    }

    public void dodajPracownika(Elf nowyPracownik)
    {
        this.pracownicy.add(nowyPracownik);
    }

    public void usunPracownika(Elf pracownikDoUsuniecia)
    {
        this.pracownicy.remove(pracownikDoUsuniecia);
    }

    public Elf najstarszyPracownik()
    {
        Elf oldest = this.pracownicy.get(0);
        for(int i = 1; i < this.pracownicy.size(); i++)
        {
            Elf current = this.pracownicy.get(i);
            if(current.getWiek() > oldest.getWiek())
                oldest = current;
        }

        return oldest;
    }



}
