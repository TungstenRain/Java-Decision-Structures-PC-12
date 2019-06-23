package ch03pc12;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date: 11/1/2017
 * purpose: calculate how long it will take for sound to travel in specific media
 */
public class Ch03pc12 {

    public static void main(String[] args) {
        //variables
        String medium;
        double distance, speed, time;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter air, water, or steel: ");
        medium = keyboard.nextLine();
        System.out.print("Please enter the distance travelled: ");
        distance = keyboard.nextDouble();
        
        //Calculations
        switch (medium)
        {
            case "air":
                speed = 1100;
                break;
            case "water":
                speed = 4900;
                break;
            case "steel":
                speed = 16400;
                break;
            default:
                speed = 0;
                break;
        }
        
        time = distance / speed;
        
        //Display output
        System.out.println("It will take " + time + " seconds to reach the destination.");
        
    }
    
}
