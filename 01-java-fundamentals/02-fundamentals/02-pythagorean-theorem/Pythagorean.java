import java.lang.Math;

public class Pythagorean {
    public double calculateHypoteneuse(int legA, int legB){
        double AB = (legA*legA) + (legB*legB);
        return Math.sqrt(AB);
    }
}