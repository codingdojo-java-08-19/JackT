import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicJava{
    public void print1To255(){
        for (int i=1; i<256; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for (int i=1; i<256; i+=2){
            System.out.println(i);
        }
    }

    public void printSum0To255(){
        int sum = 0;
        for (int i=0; i<256; i++){
            sum += i;
            String output= String.format("New number: %d Sum: %d", i, sum);
            System.out.println(output);
        }
    }

    public void iteratingArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public void findMax(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }

    public void getAverage(int[] array){
        int avg = 0;
        for (int i=0;i<array.length;i++){
            avg += array[i];
        }
        System.out.println("Average: " + avg/array.length);
    }

    public void arrayOddNum(){
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i=1; i<256; i+=2){
            odd.add(i);
        }
        System.out.println("odds: " + odd);
    }

    public Integer greaterThanY(int[] array, int y){
        int count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]>y){
                count++;
            }
        }
        System.out.println("count: " + count);

        return count;
    }

    public void squareValues(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i] *= arr[i];
            System.out.println("squared: " + arr[i]);
        }
        
    }

    public void noNegNum(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i] < 0){
                arr[i]=0;
            }
            System.out.println("No Negatives: " + arr[i]);
        }
    }

    public Object maxMinAvg(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int avg=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
            avg += arr[i];
        }
        avg/=arr.length;
        int[] newarr={max,min,avg};
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
        return newarr;
    }

    public void shiftFront(int[] arr){
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for(int i =0;i<arr.length-1;i++){
            newarr.add(arr[i]);
        }
        newarr.add(0);
        System.out.println(newarr);
    }


}