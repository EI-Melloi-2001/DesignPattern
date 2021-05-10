package Troops;

public class Yingzhang extends Officer {
    public Yingzhang(String name)
    {
        super(name);
    }
    public void handleRequest(Mission mission)
    {
        if(mission.getEnermyNum()<200 && mission.getEnermyNum()>=50)
        {
            System.out.println("营长" + name  + "下达作战指令，歼灭敌人数量：" + mission.getEnermyNum());
        }
        else {
            System.out.println("");
        }
    }
}
