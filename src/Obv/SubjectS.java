package Obv;

import java.util.ArrayList;

public abstract class SubjectS {
    protected ArrayList<ObserverO> observers;
    public SubjectS()
    {
        observers = new ArrayList<ObserverO>();
    }
    public void Add(ObserverO observer)
    {
        observers.add(observer);
    }
    public void Remove(ObserverO observer)
    {
        observers.remove(observer);
    }
    public abstract void notifyObserver();
}
