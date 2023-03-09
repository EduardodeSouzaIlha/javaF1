package entities;

public class Sponsors {
    private String name;
    private float amount;

    public Sponsors(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAmount(Float amount){
        this.amount = amount;
    }
    public void getSponsors(){
        System.out.println("The sponsor name is " + name + " and the amount is " + amount);
    }
   
}
