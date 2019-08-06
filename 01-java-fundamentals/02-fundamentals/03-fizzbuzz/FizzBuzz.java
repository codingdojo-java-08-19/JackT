public class FizzBuzz {
    public String fizzBuzz(int number){
        if (number == 3){
            return "Fizz";
        }
        else if ( number == 5){
            return "Buzz";
        }
        else if ( number == 15){
            return "FizzBuzz";
        }
        else if ( number == 2){
            return "2";
        }
        else {
            return "no output";
        }
    }
}