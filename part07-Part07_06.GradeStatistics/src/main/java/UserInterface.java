import java.util.Scanner;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class UserInterface {
    private Scanner scanner;
    private Points points;
    
    public UserInterface(Scanner scanner, Points points){
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            if(input >= 0 && input <= 100){
                points.addPoints(input);
            }
        }
    }
    
    public String toString(){
        return "Point average (all): " + points.average(points.pointsArray()) + "\n"
                + "Point average (passing): " + points.passingAverage(points.pointsArray()) + "\n"
                + "Pass percentage: " + points.passPercentage(points.pointsArray()) + "\n" +
                points.grades(points.pointsArray());
    }
}
