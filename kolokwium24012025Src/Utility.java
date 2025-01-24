public class Utility
{
    public static<T> boolean isEqualOrNull(T object1, T object2)
    {
        if(object1 == null && object2 == null)
            return true;

        if(object1.equals(object2))
            return true;


        return false;
    }

}
