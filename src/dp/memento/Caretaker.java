package dp.memento;

public class Caretaker implements Command{
    private Memento memento;
    public Memento getMemento()
    {
        return memento;
    }
    public void setMemento(Memento memento)
    {
        this.memento = memento;
    }

    @Override
    public String execute() {
        return(memento.getPassword() + memento.getTelNo() + memento.getAccount());
    }
}
