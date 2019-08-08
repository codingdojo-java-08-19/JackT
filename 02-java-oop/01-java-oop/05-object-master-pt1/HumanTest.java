public class HumanTest {
    public static void main(String[] args) {
        Human tod = new Human();
        Human bill = new Human();
        tod.attack(bill);
        System.out.println("Bills health: " + bill.health);
    }
}