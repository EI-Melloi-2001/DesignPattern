package Troops;

public abstract class Officer {
    protected String name;
    protected Officer officer;
    public Officer(String name)
    {
        this.name = name;
    }
    public void setOfficer(Officer officer)
    {
        this.officer = officer;
    }
    public abstract void handleRequest(Mission mission);
}
