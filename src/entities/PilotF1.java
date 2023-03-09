package entities;
public class PilotF1{
    private String name;
    private int age;
    private String gender;

    public PilotF1(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void getPilot() {
        System.out.println("Pilot: " + name +"\nAge: " + age + "\nGender " + gender);
    }

  
 
   
}
