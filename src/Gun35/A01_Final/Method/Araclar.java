package Gun35.A01_Final.Method;

public class Araclar {
    private  String model;

    public Araclar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}