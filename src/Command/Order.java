package Command;

import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<String,Integer> fruitmap;
    public Order()
    {
        fruitmap = new HashMap<String,Integer>();
    }
    public int getID(){
        return 0;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setFruitmap(String fruitkind, int quantity){
        this.fruitmap = fruitmap;
    }
}
