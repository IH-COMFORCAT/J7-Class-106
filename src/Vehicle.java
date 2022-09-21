public class Vehicle {


    private static int counter = 0;
    private final int id;
    private int year;
    private double cc;
    private String brand;
    private String model;

    public Vehicle(){
        this.year = 2022;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public Vehicle(int year, double cc, String brand, String model) {
        this.id = counter++;
        this.year = year;
        this.cc = cc;
        this.brand = brand;
        this.model = model;

    }

    public static Vehicle cloneVehiculo(Vehicle vehicle) {

        return new Vehicle(
                vehicle.getYear(),
                vehicle.getCc(),
                vehicle.getBrand(),
                vehicle.getModel());

    }




    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 2022) {
            System.out.println("No puede ser menor que cero");
        }else this.year = year;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
