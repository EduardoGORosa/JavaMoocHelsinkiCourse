/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Match {
    private String team1;
    private int scoreTeam1;
    private String team2;
    private int scoreTeam2;
    
    public Match(String team1, int scoreTeam1, String team2, int scoreTeam2){
        this.team1 = team1;
        this.scoreTeam1 = scoreTeam1;
        this.team2 = team2;
        this.scoreTeam2 = scoreTeam2;
    }
    
    public String nameStringTeam1(){
        return this.team1;
    }
    
    public int getScoreTeam1(){
        return this.scoreTeam1;
    }
    
    public String nameStringTeam2(){
        return this.team2;
    }
    
    public int getScoreTeam2(){
        return this.scoreTeam2;
    }
}
