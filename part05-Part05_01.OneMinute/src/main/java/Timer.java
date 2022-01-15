/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfSeconds;
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredthsOfSeconds = new ClockHand(100);
    }
    
    public String toString(){
        return this.seconds + ":" + this.hundredthsOfSeconds;
    }
    
    public void advance(){
         this.hundredthsOfSeconds.advance();

        if (this.hundredthsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
        
        if(this.seconds.value() == 60){
            this.seconds.advance();
        }
    }
}
