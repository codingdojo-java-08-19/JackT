public class Bat extends Mammal{
    public Bat(){
        this.energyLevel=300;
    }
    public void fly(){
        System.out.println("SCREEEEEEEEEE!!!! WHOOSH");
        energyLevel -=50;
    }
    public void eatHumans(){
        System.out.println("So- well nevermind.");
        energyLevel +=25;
    }
    public void attackTown(){
        System.out.println("The sound of a town on fire.");
        energyLevel -=100;

    }
    
}