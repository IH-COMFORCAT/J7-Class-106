public class Car extends Vehicle {

    private int numberDoors;
    private boolean hasAirconditioning;
    private boolean isDiesel;

    private int kilometers = 0;

    public Car(int year, double cc, String brand, String model, int numberDoors, boolean hasAirconditioning, boolean isDiesel) {
        super(year, cc, brand, model);
        setNumberDoors(numberDoors);
        this.hasAirconditioning = hasAirconditioning;
        this.isDiesel = isDiesel;
    }

    public void addNewTrip() {
        this.kilometers += 100;
    }

    public void addNewTrip(int kilometers) {
        this.kilometers += kilometers;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public Car(int numberDoors, boolean hasAirconditioning, boolean isDiesel) {
        this.numberDoors = numberDoors;
        this.hasAirconditioning = hasAirconditioning;
        this.isDiesel = isDiesel;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        if (numberDoors > 5) System.out.println("No se puede");
        else this.numberDoors = numberDoors;
    }

    public boolean isHasAirconditioning() {
        return hasAirconditioning;
    }

    public void setHasAirconditioning(boolean hasAirconditioning) {
        this.hasAirconditioning = hasAirconditioning;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }
}
