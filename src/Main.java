public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        Car car3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany");
        Car car4 = new Car("Kia", "Sportage 4th generation", 2.4, "Red", 2018, "South Korea");
        Car car5 = new Car("", "   ", 0, "  ", 0, "");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}