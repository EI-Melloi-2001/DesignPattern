package pro;

public class CLocalPicShow implements IShowPic,Runnable{
    @Override
    public void run(){
        pic.ShowPic(picName);
        System.out.println(picName + "图片调用完成！");
    }

    private IShowPic pic;
    private String picName;
    @Override
    public void ShowPic(String picName) {
        pic = new CRemoPic();
        this.picName = picName;
        System.out.println("准备载入图片" + picName);
        Thread th = new Thread(this);
        th.start();

    }
}
