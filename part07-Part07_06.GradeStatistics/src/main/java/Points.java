
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
public class Points {
    private ArrayList<Integer> points;
    
    public Points(){
        this.points = new ArrayList<Integer>();
    }
    
    public ArrayList<Integer> pointsArray(){
        return this.points;
    }
    
    public void addPoints(int point){
        points.add(point);
    }
    
    public double average(ArrayList<Integer> points){
        int sum = 0;
        for(int i:points){
            sum = sum + i;
        }
        return 1.0 * sum / points.size();
    }
    
    public double passingAverage(ArrayList<Integer> points){
        int sum = 0;
        int passing = 0;
        for(int i:points){
            if(i>= 50){
                sum = sum + i;
                passing++;
            }
        }
        return 1.0 * sum / passing;
    }
    
    public double passPercentage(ArrayList<Integer> points){
        int passing = 0;
        for(int i:points){
            if(i>= 50){
                passing++;
            }
        }
        return passing * 100.0 / points.size();
    }
    
    public String stars(int grades){
        String stars = "";
        for(int i = 1;i <= grades;i++){
            stars = stars + "*";
        }
        return stars;
    }
    
    public String grades(ArrayList<Integer> points){
        int[] grade = new int[6];
        for(int i:points){
            if(i<50){
                grade[0]++;
            }else if(i<60){
                grade[1]++;
            }else if(i<70){
                grade[2]++;
            }else if(i<80){
                grade[3]++;
            }else if(i<90){
                grade[4]++;
            }else if(i>=90){
                grade[5]++;
            }
        }
        
        return "5: " + stars(grade[5]) + "\n" + 
                "4: " + stars(grade[4]) + "\n" +
                "3: " + stars(grade[3]) + "\n" +
                "2: " + stars(grade[2]) + "\n" +
                "1: " + stars(grade[1]) + "\n" +
                "0: " + stars(grade[0]);
    }
}
