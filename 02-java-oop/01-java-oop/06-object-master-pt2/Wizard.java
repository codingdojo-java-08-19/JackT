public class Wizard extends Human{
    public Wizard(){
        health = 50;
        intelligence = 8;
    }
    public void heal(Human target){
        target.health += intelligence;
    }
    public void fireball(Human target){
        target.health -= 3*intelligence;
    }
}