package Gun35.A02_Polymormphism;

public class Hayvan {
   private String name;

    public Hayvan(String name) {
        this.name = name;
    }
    public void ses(){
        System.out.println("ses cikardi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
