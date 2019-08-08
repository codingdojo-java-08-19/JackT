public class Samurai extends Human{
    int current =0;
    public Samurai(){
        health = 200;
        current++;
    }
    public void deathBlow(Human target){
        target.health = 0;
        health /= 2;
    }
    public void meditate(){
        health += health/2;
    }
    public int howMany(){
        return current;
    }
}