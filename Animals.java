import java.util.*;

public class Animals {
    private String name ;
    private int legs;
    private String breed;
    
    public Animals(String name, int legs, String breed){
      this.name = name;
      this.legs = legs;
      this.breed = breed;
    }
  
    //Setters
    public void setName(String name){
      this.name = name;
    }
    
    public void setLegs(int legs){
      this.legs = legs;
    }

    public void setBreed(String breed){
      this.breed = breed;
    }
    
    //Getters
    public String getName(){
      return this.name;
    }

    public int getLegs(){
      return this.legs;
    }

    public String getBreed(){
      return this.breed;
    }
}
