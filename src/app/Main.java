package app;

public class Main {
    public static void main(String[] args){

        Car mine = new Car(25, "black", "nissan");
        Car hers = new Car(50, "red", "Mercedes");
        System.out.println(mine.start());
        System.out.println(hers.start());
        System.out.println(mine.getSpeed());
        System.out.println(hers.getSpeed());
        System.out.println(mine.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(mine.getSpeed());
        System.out.println(hers.getSpeed());
        System.out.println(mine.decelerating());
        System.out.println(mine.getSpeed());
        System.out.println(mine.stop());

    }
}
