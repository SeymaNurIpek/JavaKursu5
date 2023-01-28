package Gun24;

import java.util.HashMap;
import java.util.Map;

public class A02_KonuAnlatimDevam {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "Seyma Ipek");
        hm.put(1002, "Emre Ipek");
        hm.put(2001,"Kerim Koc");
        hm.put(5001,"Ekrem Koc");
        hm.put(1002, "Ertugrul");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm = " + hm.values());

        for (Integer k:hm.keySet()) {
            System.out.print(k +"\t");

        }
        System.out.println();
        for (String v:hm.values()) {
            System.out.print(v+"\t");

        }
        System.out.println();
        // tamami setin
        for (Map.Entry<Integer,String> kv:hm.entrySet()) {
            System.out.print(kv.getKey()+"-" + kv.getValue());

        }
        System.out.println();
        System.out.println(hm);
    }
}
