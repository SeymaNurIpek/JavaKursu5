package Gun39.Soru5_1;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("Mukummel yerli pizza");
    }

    @Override
    public double ucret() {
        return 33;
    }
    void dough(){
        System.out.println("Mayali hamur hazirlandi");
    }

    void  aadMeat(){
        System.out.println("Ozel kiyma eklendi");
    }
    void bake(){
        System.out.println("Odun atesinde pisirildi");
    }
}
