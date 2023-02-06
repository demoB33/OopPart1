public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = validateCarBrandModelCountry(brand);
        this.model = validateCarBrandModelCountry(model);
        this.engineVolume = validateEngine(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateCarBrandModelCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public static double validateEngine(double value) {
        if (value <= 0 ) {
            value = 1.5;
        }return value;
    }
    public  static int validateYear(int year) {
        if (year <= 0) {
            year = 2000;
        }return year;
    }

    public static String validateColor(String color) {
        if (color.isEmpty()|| color.isBlank() || color==null ) {
            color = "White";
        }return color;
    }
    public static String validateCarBrandModelCountry(String brand) {
        if (brand.isBlank() || brand.isBlank() || brand == null) {
            brand = "default";
        }
        return brand;
    }

}
