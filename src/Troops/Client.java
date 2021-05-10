package Troops;


public class Client {
    public static void main(String args[])
    {
        Officer objBanzhang,objPaizhang,objYingzhang;

        objBanzhang = new Banzhang("王明");
        objPaizhang = new Paizhang("赵强");
        objYingzhang = new Yingzhang("李波");

        objBanzhang.setOfficer(objPaizhang);
        objPaizhang.setOfficer(objYingzhang);

        Mission ms1 = new Mission("张三",1);
        objBanzhang.handleRequest(ms1);

        Mission ms2 = new Mission("李四",5);

        objPaizhang.handleRequest(ms2);

        Mission ms3 = new Mission("王五",15);

        objBanzhang.handleRequest(ms3);

        Mission ms4 = new Mission("赵六",150);

        objBanzhang.handleRequest(ms4);

        Mission ms5 = new Mission("周七",300);
        objBanzhang.handleRequest(ms5);
    }
}
