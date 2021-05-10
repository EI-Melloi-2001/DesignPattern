package Troops;

public class Paizhang extends Officer{

    public Paizhang(String name){
            super(name);
    }
    public  void handleRequest(Mission mission)
    {
        if(mission.getEnermyNum()<50 && mission.getEnermyNum()>=10)
        {
            System.out.println("排长" + name  + "下达作战指令，歼灭敌人数量：" + mission.getEnermyNum());
        }
        else
        {
            if(this.officer!=null)
            {
                this.officer.handleRequest(mission);
            }
        }
    }
}
