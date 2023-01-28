package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bagis parasinin toplamini yazdiriniz

        String bagis1="500";
        String bagis2="1500";
       // benim cozumum
        System.out.println(Integer.valueOf(bagis1)+Integer.valueOf(bagis2));
        //hocanin cozumu
        int intBagis1=Integer.parseInt(bagis1);
        int intBagis2=Integer.parseInt(bagis2);
        int toplamBagis=intBagis1+intBagis2;
        System.out.println("toplamBagis= "+toplamBagis);
    }
}
