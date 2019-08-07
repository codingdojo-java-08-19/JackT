import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava{
    public Object greaterThan10(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> num = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>10){
                num.add(arr[i]);
            }
        }
        System.out.println("Sum: " + sum);
        return num;
    }

    public ArrayList<String> nameList(){     
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> longNames = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        for(String string : names){
            if(string.length() > 5){
                longNames.add(string);
            }
        }
        Collections.shuffle(names);
        System.out.println(names);
        return longNames;
    }

    public void alphabetShuffle(){
        char[] chr = {'a','e','i','o','u','y'};
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> alpha = new ArrayList<Character>();
        for(int i =0;i<alphabet.length;i++){
            alpha.add(alphabet[i]);
        }
        Collections.shuffle(alpha);
        System.out.println("first letter: " + alpha.get(0) + " Last letter: " + alpha.get(alpha.size()-1));
        for (int i =0;i<chr.length;i++){
            if(alpha.get(0) == chr[i] ){
                System.out.println("First letter is a vowel: " + alpha.get(0));
            }
        }
    }

    public Object randoNum(){
        int high = 100;
        int low = 55;
        ArrayList<Integer> rando = new ArrayList<Integer>();
        Random num = new Random();
        for(int i=0;i<10;i++){
            rando.add(num.nextInt(high-low)+low);
        }

        return rando;
    }

    public Object randoNumSort(){
        int high = 100;
        int low = 55;
        ArrayList<Integer> rando = new ArrayList<Integer>();
        Random num = new Random();
        for(int i=0;i<10;i++){
            rando.add(num.nextInt(high-low)+low);
            System.out.println(rando.get(i));
        }
        Collections.sort(rando);
        System.out.println("lowest num: " + rando.get(0));
        System.out.println("highest num: " + rando.get(9));
        return rando;
    }

    public String randoStr(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> rchr = new ArrayList<Character>();
        StringBuilder newstr = new StringBuilder();
        Random num = new Random();
        for(int i =0;i<5;i++){
            int rnum=num.nextInt(26);
            rchr.add(alphabet[rnum]);
        }
        for(int i =0;i<rchr.size();i++){
            newstr.append(rchr.get(i));
        }
        String string = newstr.toString();
        System.out.println(string);
        return string;
    }

    public void arrRandoStr(){
        ArrayList<String> rstr = new ArrayList<String>();
        for(int i =0;i<10;i++){
            rstr.add(randoStr());
        }
        System.out.println(rstr);
    }
}