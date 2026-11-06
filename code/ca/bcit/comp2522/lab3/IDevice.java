public abstract class IDevice
{
    private final String purpose;

    public IDevice(final String purpose)
    {
        this.purpose = purpose;

    }

    public String getPurpose()
    {
        return purpose;
    }

    abstract void printDetails();

    @Override
    public String toString()
    {
        return "purpose" + purpose;
    }

    @Override
    public boolean equals(final Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        return purpose.hashCode(); 
    }
}


