package Day_56_Inheritance1.HomeWork;

public class Plane extends Vechicle{
    protected double propellerSize;
    protected String engineType;

    public Plane() {
    }

    public void rotorRpm(){
        System.out.println("Speed rotor");
    }
    public void pressureCheck(){
        System.out.println("Pressure check");
    }
    public void taxi(){
        System.out.println("Ticket kostet 100 euro");
    }

    public double getPropellerSize() {
        return propellerSize;
    }

    public void setPropellerSize(double propellerSize) {
        this.propellerSize = propellerSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
