import java.util.ArrayList;
import java.util.Objects;

public class Sanie
{
    private ArrayList<Renifer> renifery = new ArrayList<Renifer>();

    public Sanie(ArrayList<Renifer> renifery)
    {
        this.setRenifery(renifery);
    }

    public ArrayList<Renifer> getRenifery() {
        return renifery;
    }

    public void setRenifery(ArrayList<Renifer> renifery)
    {
        if(renifery.size() == 0 || renifery == null)
        {
            throw new NullPointerException("renifery is 0 or null BLAD");
        }
        else
        {
            this.renifery = renifery;
        }
    }

    @Override
    public String toString()
    {
        String resultString = "Renifery:\n";

        for(int i = 0; i < this.renifery.size(); i++)
        {
            Renifer renifer = this.renifery.get(i);
            resultString += renifer.toString();
            resultString += "\n";
        }

        return resultString;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(this.getClass() != obj.getClass())
            return false;

        Sanie sanie = (Sanie)obj;

        return (this.renifery == sanie.renifery);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.renifery);
    }

    public void dodajRenifera(Renifer nowyRenifer)
    {
        this.renifery.add(nowyRenifer);
    }

    public int sumaPredkosc()
    {
        int suma = 0;
        for(int i = 0; i < this.renifery.size(); i++)
        {
            Renifer current = this.renifery.get(i);
            suma += current.getPredkosc();
        }

        return suma;
    }

    public Renifer najwolniejszyRenifer()
    {
        Renifer najwolniejszy = this.renifery.get(0);
        for(int i = 1; i < this.renifery.size(); i++)
        {
            Renifer current = this.renifery.get(i);
            if(current.getPredkosc() < najwolniejszy.getPredkosc())
            {
                najwolniejszy = current;
            }
        }

        return najwolniejszy;
    }


}
