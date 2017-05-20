package be.qpact.webflux.demo.model;

/**
 * Created by kevin on 20/05/17.
 */
public class Asset {
    private String make;
    private String model;
    public Asset(){

    }
    public Asset(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
