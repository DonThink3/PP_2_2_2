package web.models;

public class Car {
    private String model;

    private String color;

    private String prise;

    public Car(){}

    public Car(String model, String color, String prise) {
        this.model = model;
        this.color = color;
        this.prise = prise;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }
}
