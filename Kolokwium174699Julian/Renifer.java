import java.util.Objects;

public class Renifer
{
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc)
    {
        this.setImie(imie);
        this.setPredkosc(predkosc);
    }

    public String getImie()
    {
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

    public int getPredkosc()
    {
        return predkosc;
    }

    public void setPredkosc(int predkosc)
    {
        if(predkosc == 0 || predkosc < 0)
        {
            throw new NullPointerException("predkosc is wrong");
        }
        else
        {
            this.predkosc = predkosc;
        }

    }

    @Override
    public String toString()
    {
        return String.format("Renifer %s prekosc %d", this.imie, this.predkosc);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(this.getClass() != obj.getClass())
            return false;

        Renifer renifer = (Renifer) obj;

        return (this.imie == renifer.imie && this.predkosc == renifer.predkosc);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.imie, this.predkosc);
    }

    public void nakarmRenifera()
    {
        this.predkosc += 5;
    }
}
