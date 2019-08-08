public class Gorrilla extends mammal{
    public void throwSomething(){
        System.out.println("The Gorilla has thrown something.");
        energyLevel -= 5;

    }
    public void eatBananas(){
        System.out.println("The Gorilla has eaten a banana and it was delicious... YUM!!");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("The Gorilla has climbed a tree.");
        energyLevel -= 10;
    }
}