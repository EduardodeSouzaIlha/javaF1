package entities;

import java.util.Scanner;

public class Team {
    private String name;
    private int fundationYear;
    Sponsors collaborators[] = new Sponsors[10];  
    Scanner scan = new Scanner(System.in);
    private int quantity;

    public Team(String name, int fundationYear, int quantity){
        this.name= name;
        this.fundationYear = fundationYear;
        this.quantity = quantity;
        for(int i=0; i < quantity; i++){
            System.out.println("Type the sponsor name ");
            String nameSponsor = scan.nextLine();
            System.out.println("Type the sponsor amount ");
            float amount = scan.nextFloat();
            scan.nextLine();
            collaborators[i] = new Sponsors(nameSponsor, amount);
            if(i == 10){
                break;
            }
        }

    }
    public void setName(String name){
        this.name = name;
    }
    public void setFundationYear(int fundationYear){
        this.fundationYear = fundationYear;
    }
    public void getTeam(){
        System.out.println( name + " Is the name's team and the fundation year is: " + fundationYear);
        for(int i=0; i < this.quantity; i++){
            collaborators[i].getSponsors();
        }
    }
    
}
