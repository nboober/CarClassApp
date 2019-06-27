package app;

import java.util.ArrayList;

public class Car extends Vehicle {

    private String brand = "";
    private String color = "";
    ArrayList<Car> cars = new ArrayList<>();

    public Car(){

    }

    public Car(int speed, String color, String model){
        super(speed);
        this.brand = model;
        this.color = color;

        System.out.println("There is a " + this.color + " " + this.brand + ".");
    }

    public void setCar(int speed, String color, String model){
        Car car = new Car(speed, color, model);
        cars.add(car);
    }

    public String getCars(){
        String str = "";

        for(Car item : cars){
            str += item;
        }

        return str;
    }

    public String start(){
        return "The "+ this.color + " " + this.brand + " is Starting...";
    }

    public String stop(){
        return "The "+ this.color + " " + this.brand + "  is stopping...";
    }

    public String accelerating(){
        this.setSpeed(this.speed + 10);

        return "The "+ this.color + " " + this.brand + "  is accelerating..." + "\n" +
                " it is now going " + (this.speed) + " mph.";
    }

    public String decelerating(){
        this.setSpeed(this.speed - 10);

        return "The "+ this.color + " " + this.brand + "  is decelerating..." + "\n" +
                " it is now going " + (this.speed) + " mph.";
    }



}
