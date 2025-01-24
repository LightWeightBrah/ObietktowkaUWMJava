public class Triple<T, R, S>
{
    private T first;
    private R second;
    private S third;

    public Triple(T first, R second, S third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    public S getThird() {
        return third;
    }
}
