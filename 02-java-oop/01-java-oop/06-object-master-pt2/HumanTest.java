public class HumanTest {
    public static void main(String[] args) {
        Wizard tod = new Wizard();
        Ninja bill = new Ninja();
        Samurai jack = new Samurai();
        Samurai sam = new Samurai();
        jack.attack(bill);
        System.out.println("Jack attacks Bill whose health is now: " + bill.health);
        tod.heal(bill);
        System.out.println("Tod heals Bill whose health is now: " + bill.health);
        jack.deathBlow(sam);
        System.out.println("Jack attacks Sam with a deathblow, his health is now: " + jack.health + "sams health: " + sam.health);
        System.out.println("Sam is dead how many samurai remain: " + jack.howMany());
        bill.runAway();
        System.out.println("Bill runs away his health is now: " + bill.health);
        tod.fireball(jack);
        System.out.println("Tod hits jack with a Fireball Jack's health is now: " + jack.health);
        jack.deathBlow(tod);
        System.out.println("Jack attacks tod with a death blow his health is now: " + jack.health + "tod's health is now: " + tod.health);
        System.out.println("tod is dead");
        jack.meditate();
        System.out.println("Jack mediates his health is now: " + jack.health);

    }
}