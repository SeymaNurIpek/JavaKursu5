package Gun24;

import java.util.HashMap;
import java.util.Map;

public class A03_KartVizitOlusturma {
    public static void main(String[] args) {
        // bir kartvizit 

        HashMap<String ,String> uKArtVizit=new HashMap<>();
        uKArtVizit.put("isim","Ugur Yilmaz");
        uKArtVizit.put("Email","ugur@gmail.com");
        uKArtVizit.put("adres","Cekmekoy/Istanbul");
        uKArtVizit.put("telefon","05302569355");
        System.out.println("uKArtVizit = " + uKArtVizit.get("isim"));
        System.out.println("uKArtVizit.get(telefon) = " + uKArtVizit.get("telefon"));


        HashMap<String ,String> aKArtVizit=new HashMap<>();
        aKArtVizit.put("isim","Ayse koc");
        aKArtVizit.put("Email","ayse@gmail.com");
        aKArtVizit.put("adres","sultanbeyli/Istanbul");
        aKArtVizit.put("telefon","05354769355");
        
        HashMap<String,HashMap<String ,String >> kartvizitler=new HashMap<>();
        
        kartvizitler.put("ugur", uKArtVizit);
        kartvizitler.put("ayse",aKArtVizit);

        System.out.println("kartvizitler.get(ugur) = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(ayse) = " + kartvizitler.get("ayse"));

        System.out.println("aysenin adresi = " + kartvizitler.get("ayse").get("adres"));


        for (Map.Entry<String ,HashMap<String ,String >> kv:kartvizitler.entrySet()) {
            System.out.println("emailler= "+kv.getValue().get("Email"));
        }
        
    }
}
