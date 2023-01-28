package AhmetHoca.BesinciHafta;

import java.util.ArrayList;
import java.util.Arrays;

public class Hafta5_Soru3 {
    public static void main(String[] args) {
        // Soru - 2 : TODO Bir Arraylist i Array e nasil donustururuz?.....
        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Phyton", "C++"));
        String [] s=new String[diller.size()];
        for (int i = 0; i < diller.size(); i++) {
            s[i]= diller.get(i);
            System.out.println(s[i]);

        }
        System.out.println(Arrays.toString(s));

        // 2. yontem

        diller.toArray(s);
        System.out.println(Arrays.toString(s));

    }
}
