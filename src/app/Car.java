package app;

public class Car extends Vehicle {

    private String brand = "";
    private String color = "";


    public Car(int speed, String color, String model){
        super(speed);
        this.brand = model;
        this.color = color;

        System.out.println("There is a " + this.color + " " + this.brand + ".");
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
