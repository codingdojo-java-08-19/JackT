public class Human{
    public int health =100;
    public int strength =3;
    public int stealth =3;
    public int intelligence =3;

    public void attack(Human target){
        target.health -= strength;
    }
}