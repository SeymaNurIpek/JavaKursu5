package Gun24;

import java.util.HashMap;
import java.util.HashSet;

public class A01_HashMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "Seyma Ipek");
        hm.put(1002, "Emre Ipek");
        hm.put(2001,"Kerim Koc");
        hm.put(5001,"Ekrem Koc");
        hm.put(1002, "Ertugrul");

        System.out.println("hm = " + hm);// 2001= Kerim Koc diye hepsini yazdirir
        System.out.println("hm.get(2001) = " + hm.get(2001));//Kerim Koc
        System.out.println("hm.get(5001) = " + hm.get(5001));// Ekrem Koc

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));//true
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));//false

        System.out.println("hm.keySet() = " + hm.keySet());// sadece Integerler alir
        System.out.println("hm.values() = " + hm.values());// sadece Stringler alir

        hm.remove(5001);// 5001 li yi sil
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());// boyutunu verir

        hm.clear();
        System.out.println("hm = " + hm);// hepsini silip temizler
    }
}
