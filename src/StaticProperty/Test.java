package StaticProperty;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes G63", "Bi-turbo V8");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
