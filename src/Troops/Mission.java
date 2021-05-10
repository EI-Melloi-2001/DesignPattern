package Troops;

public class Mission {
    private String leaveOrder;
    private int enermyNum;

    public Mission(String leaveOrder, int enermyNum)
    {
        this.leaveOrder = leaveOrder;
        this.enermyNum = enermyNum;
    }

    public void setLeaveOrder(String leaveOrder)
    {
        this.leaveOrder = leaveOrder;
    }

    public void setEnermyNum(int enermyNum)
    {
        this.enermyNum = enermyNum;
    }

    public String getLeaveOrder()
    {
        return(this.leaveOrder);
    }

    public int getEnermyNum()
    {
        return(this.enermyNum);
    }
}
