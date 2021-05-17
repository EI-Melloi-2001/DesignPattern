package Command;

public class OrderCommand implements Command{
    //放两个参数，一个是执行者，一个是执行目标
    private Operator receiver;
    private Order order;
    public OrderCommand(Operator receiver, Order order)
    {
        this.receiver = receiver;
        this.order = order;
    }
    @Override
    public void execute(){
        System.out.println(order.getID() + "号顾客的成品");
        receiver.MarkFruit(order);
    }
}
