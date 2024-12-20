import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Objects;

public class Elf
{
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko)
    {
        this.setImie(imie);
        this.setWiek(wiek);
        this.setStanowisko(stanowisko);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie)
    {
        if(imie == null || imie.isEmpty())
        {
            throw new NullPointerException("imie is null or empty");
        }
        else
        {
            this.imie = imie;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek)
    {
        if(wiek == 0 || wiek < 0)
        {
            throw new NullPointerException("wiek is wrong BLAD");
        }
        else
        {
            this.wiek = wiek;
        }
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko)
    {
        if(stanowisko == null || stanowisko.isEmpty())
        {
            throw new NullPointerException("stanowisko is null or empty");
        }
        else
        {
            this.stanowisko = stanowisko;
        }
    }

    @Override
    public String toString()
    {
        return String.format("Elf %s wiek %d stanowisko %s", this.imie, this.wiek, this.stanowisko);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(this.getClass() != obj.getClass())
            return false;

        Elf elf = (Elf)obj;

        return (this.imie == elf.imie && this.wiek == elf.wiek && this.stanowisko == elf.stanowisko);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.imie, this.wiek, this.stanowisko);
    }

    public void przedstawSie()
    {
        System.out.println(String.format("Czesc nazywam sie %s, mam %d lat," +
                " a moje stanowsiko pracy to %s", this.imie, this.wiek, this.stanowisko));
    }

}