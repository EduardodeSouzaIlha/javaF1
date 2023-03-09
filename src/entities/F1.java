package entities;

import java.util.Scanner;

public class F1 {
    private int num;
    private int position;
    Team team;
    PilotF1 pilot;
    Scanner scan = new Scanner(System.in);
    
    public F1(int num, int position){
        this.num = num;
        this.position = position;
        try{
            System.out.println("Type the pilot name ");
            String namePilot =  scan.nextLine();
            System.out.println("Type the pilot age ");
            int agePilot = scan.nextInt();
            scan.nextLine();
            System.out.println("Type the pilot GENDER ");
            String genderPilot = scan.nextLine();
            System.out.println("Type the Team name ");
            String nameTeam = scan.nextLine();
            System.out.println("Type the Team fundation year ");
            int fundationYear = scan.nextInt();
            scan.nextLine();
            System.out.println("Type the sponsers quantity ");
            int quantity = scan.nextInt();
            scan.nextLine();
            pilot = new PilotF1(namePilot, agePilot, genderPilot );
            team = new Team(nameTeam, fundationYear, quantity);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Obigado por usar o programa");
            
        }
       
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void getF1(){
        System.out.println("The number of this pilot is " + num + " and the position is " + position);
        pilot.getPilot();
        team.getTeam();
        
    }
    


}
