
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Filename:");
        String file = scan.nextLine();
        ArrayList<Match> teams = readRecordsFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        int matches = gamesPlayedFromTeam(teams, team);
        int won = gamesWon(teams, team);
        int lost = gamesLost(teams, team);
        System.out.println("Games: " + matches);
        System.out.println("Wins: " + won);
        System.out.println("Losses: " + lost);
    }
    
    public static ArrayList<Match> readRecordsFromFile(String file) {
        ArrayList<Match> teams = new ArrayList<>();
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(",");
                if(line.isEmpty()){
                    continue;
                }
                teams.add(new Match(parts[0], Integer.valueOf(parts[2]), parts[1], Integer.valueOf(parts[3])));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return teams;

    }

    public static int gamesPlayedFromTeam(ArrayList<Match> teams, String team){
        int matches = 0;
        for(Match printGames: teams){
            if(printGames.nameStringTeam1().equals(team) || printGames.nameStringTeam2().equals(team)){
                matches++;
            }
        }
        return matches;
    }
    
    public static int gamesWon(ArrayList<Match> teams, String team){
        int matchesWon = 0;
        for(Match printGames: teams){
            if(printGames.nameStringTeam1().equals(team) && printGames.getScoreTeam1() > printGames.getScoreTeam2() ||
                    printGames.nameStringTeam2().equals(team) && printGames.getScoreTeam2() > printGames.getScoreTeam1()){
                matchesWon++;
            }
        }
        return matchesWon;
    }
    
    public static int gamesLost(ArrayList<Match> teams, String team){
        int matchesLost = 0;
        for(Match printGames: teams){
            if(printGames.nameStringTeam1().equals(team) && printGames.getScoreTeam1() < printGames.getScoreTeam2() ||
                    printGames.nameStringTeam2().equals(team) && printGames.getScoreTeam2() < printGames.getScoreTeam1()){
                matchesLost++;
            }
        }
        return matchesLost;
    }
}
