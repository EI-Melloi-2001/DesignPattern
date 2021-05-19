package state;

public class DeadState extends ThreadState{
    public DeadState()
    {
        state = StateSet.DEAD;
        System.out.println("杀死线程");
    }
}
