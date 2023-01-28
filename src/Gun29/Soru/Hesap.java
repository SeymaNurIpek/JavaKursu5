package Gun29.Soru;

public class Hesap {
     private int yatan;

    private int cekilen;

    private int bakiye;
    public void  parayatir(int yatanPara){
        yatan+=yatanPara;
        bakiye+=yatanPara;
    }
    public void paraCek(int cekilenPara){
        cekilen+=cekilenPara;
        bakiye-=cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
