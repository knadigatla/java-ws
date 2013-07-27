package temp;

public class StaticFinal
{
    private final int i ;

    public StaticFinal()throws InstantiationException
    {
    	i =2;
        throw new InstantiationException("Can't instantiate"); // Don't let the constructor to complete.
    }
}