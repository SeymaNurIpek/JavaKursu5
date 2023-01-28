package Gun24;

import java.util.*;

public class A04_JavaMap {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);// hizli calismak amac kafasina gore siralama

        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(11,"kus");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);//eklendigi siraya gore

        Map<Integer,String> tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"kopek");
        tm.put(11,"kus");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);//her zaman sirali KEY e gore


    }
}
