package app;

abstract class Vehicle {

    protected int speed = 0;

    public Vehicle(){

    }

    public Vehicle(int speed){
        this.speed = speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getSpeed(){
        return "The car is going " + this.speed + " mph.";
    }

}
