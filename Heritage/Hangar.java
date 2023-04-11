package Heritage;

/**
 * Hangar
 */
public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 10);
        Boat boat = new Boat("Marin", 100);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }
}