public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava x = new BasicJava();
        x.print1To255();
        x.printOdd1To255();
        x.printSum0To255();
        int[] arr1 = {1,3,5,7,9,13,-2,-3};
        x.iteratingArray(arr1);
        int[] arr2 = {1,3,5,7,9,13,-2,-3};
        x.findMax(arr2);
        int[] arr3 = {1,3,5,7,9,13,-2,-3};
        x.getAverage(arr3);
        x.arrayOddNum();
        int[] arr4 = {1,3,5,7,9,13,-2,-3};
        x.greaterThanY(arr4, 5);
        int[] arr5 = {1,3,5,7,9,13,-2,-3};
        x.squareValues(arr5);
        int[] arr6 = {1,3,5,7,9,13,-2,-3};
        x.noNegNum(arr6);
        int[] arr7 = {1,3,5,7,9,13,-2,-3};
        x.maxMinAvg(arr7);
        int[] arr8 = {1,3,5,7,9,13,-2,-3};
        x.shiftFront(arr8);
    }
}