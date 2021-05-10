package Troops;

public class Banzhang extends Officer{
    public Banzhang(String name){
        super(name);
    }
    public  void handleRequest(Mission mission)
    {
        if(mission.getEnermyNum()<10)
        {
            System.out.println("班长" + name + "下达作战指令，歼灭敌人数量：" + mission.getEnermyNum());
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
