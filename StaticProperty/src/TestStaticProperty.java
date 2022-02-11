public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "V3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Maybach", "V8");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Lamboghini Aventador", "V12" );
        System.out.println(Car.numberOfCar);
    }
}
