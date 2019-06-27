package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Car mine = new Car(25, "black", "nissan");
        Car hers = new Car(50, "red", "Mercedes");
        System.out.println(mine.start());
        System.out.println(hers.start());
        System.out.println(mine.speed());
        System.out.println(hers.speed());
        System.out.println(mine.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(hers.accelerating());
        System.out.println(mine.speed());
        System.out.println(hers.speed());
        System.out.println(mine.decelerating());
        System.out.println(mine.speed());
        System.out.println(mine.stop());

        System.out.println("Design your own Car. Enter your car information (Top Speed, Color, and Brand)");
        int speed = scanner.nextInt();
        String color = scanner.next();
        String brand = scanner.next();


        Car car3 = new Car();
        car3.setCar(speed, color, brand);

        car3.getCars();
        car3.start();
    }
}
