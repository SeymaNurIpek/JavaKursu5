package Gun38.Abstract2;

public abstract class  Sekil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double alan();//soyut-abstract
    abstract double cevre();//soyut
    public  void ciz(){
        System.out.println(name+"isimli sekil ");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre='" + cevre()+ '\'' +

                '}';
    }
}
