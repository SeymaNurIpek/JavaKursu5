package Gun27.A01_Ornek;

public class JavaStaticveNonStaticMethodlar {
    public static void main(String[] args) {
        int sayi=345;
        String  strSayi=String.valueOf(sayi);
        int intSayi=Integer.parseInt(strSayi);

        double rndSayi=Math.random();



        Utility ut=new Utility();
        String strSayi2=ut.getString(sayi) ;


        //Static methodlar zaten varolduklari icin
        // new ile yeni olusturmaya ihtiyac duymazlar

        String strSayi3= Utility. getString2(sayi);

    }
}
