package transport;

import javax.swing.*;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int seatCount;

    private String transmission;
    private String number;
    private boolean seasonSumRubber;
    private double engineVolume;
    private Key key;


    public Car(String brand, String model, String color, int year, String country, String bodyType, int seatCount, String transmission, String number, boolean seasonRubber, double engineVolume, Key key) {
        this.brand = validateCarBrandModelCountry(brand);
        this.model = validateCarBrandModelCountry(model);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateCarBrandModelCountry(country);
        this.bodyType = validateBodyType(bodyType);
        this.seatCount = validateSeatCount(seatCount);
        this.transmission = validateTransmission(transmission);
        this.number = validateNumber(number);
        this.seasonSumRubber = seasonRubber;
        this.engineVolume = validateEngine(engineVolume);
        this.key = key;

    }

    public static class Key {
        private final Boolean remoteStart;
        private final Boolean keyLess;

        public Key(Boolean remoteStart, Boolean keyLess){
            this.remoteStart = validateBoolean(remoteStart);
            this.keyLess = validateBoolean(keyLess);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLess=" + keyLess +
                    '}';
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = validateNumber(number);
    }

    public boolean isSeasonSumRubber() {
        return seasonSumRubber;
    }

    public void setSeasonSumRubber(boolean seasonSumRubber) {
        this.seasonSumRubber = seasonSumRubber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", seatCount=" + seatCount +
                ", transmission='" + transmission + '\'' +
                ", number='" + number + '\'' +
                ", seasonSumRubber=" + seasonSumRubber +
                ", engineVolume=" + engineVolume +
                ", key=" + key +
                '}';
    }

    public  static Boolean validateBoolean(Boolean value){
        return value != null && value;
    }
    public static String validateBodyType (String bodyType){
        if (bodyType.isEmpty() || bodyType.isBlank() || bodyType == null) {
            bodyType = "Default";
        }
        return bodyType;
    }

    public void changeTyres(int month) {
        if (month >= 3 && month <= 10) {
            seasonSumRubber = true;
        } else {
            seasonSumRubber = false;
        }
    }
    public String validateNumber(String number){
        if(Pattern.matches("[a-z][0-9]{3}[a-z]{2}[0-9]{3}", number)){
            return number;
        } else{
        System.out.println("number error");
        return "number error";
        }
    }

    public static String validateTransmission(String transmission) {
        if (transmission.isEmpty() || transmission.isBlank() || transmission == null) {
            transmission = "Default";
        }
        return transmission;
    }

        public static int validateSeatCount ( int seatCount){
            if (seatCount <= 0) {
                seatCount = 4;
            }
            return seatCount;
        }

        public static double validateEngine ( double value){
            if (value <= 0) {
                value = 1.5;
            }
            return value;
        }
        public static int validateYear ( int year){
            if (year <= 0) {
                year = 2000;
            }
            return year;
        }

        public static String validateColor (String color){
            if (color.isEmpty() || color.isBlank() || color == null) {
                color = "White";
            }
            return color;
        }
        public static String validateCarBrandModelCountry (String brand){
            if (brand.isBlank() || brand.isBlank() || brand == null) {
                brand = "default";
            }
            return brand;
        }

    }
