package DPro;

public class Client {
    public static void main(String args[]) {
        ITestInterface ipic = new CTest();
        ITestInterface proxy = (ITestInterface) new CLocalPicShow(ipic);
        proxy.SendMessage("AAA");
    }
}
