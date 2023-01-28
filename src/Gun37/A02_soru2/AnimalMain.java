package Gun37.A02_soru2;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Swallow kirlangic=new Swallow("kus","kahverengi");
        Cat kedi=new Cat("van","beyaz");
        Shark kopekBaligi=new Shark("kopek","gri");
        Duck ordek=new Duck("kug","beyaz");

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(kirlangic);
        hayvanlar.add(kopekBaligi);
        hayvanlar.add(kedi);
        hayvanlar.add(ordek);

        for ( Animal h:hayvanlar){
            System.out.println("*****************");
            System.out.println(h.getClass().getSimpleName());// class in adini verir
            System.out.println("*******************");

            System.out.println("h.getRenk() = " + h.getRenk());
            System.out.println("h.getTuru() = " + h.getTuru());
            if (h instanceof Swallow){
                System.out.println(((Swallow) h).flying());
                System.out.println(((Swallow) h).food());
            }
            else
            if(h instanceof Cat){
                System.out.println(((Cat) h).food());
            }
            else if(h instanceof Shark){
                System.out.println(((Shark) h).food());
                System.out.println(((Shark) h).salling());
            }
            else if(h instanceof Duck){
                System.out.println(((Duck) h).food());
                System.out.println(((Duck) h).salling());
                System.out.println(((Duck) h).flying());
            }

        }

    }
}
