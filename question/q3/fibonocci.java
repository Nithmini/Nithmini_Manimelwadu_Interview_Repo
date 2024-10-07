package q3;

public class fibonocci {
    public static void main(String[] args){
        int[] fibonacciArray = new int[100];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        // Generate Fibonacci numbers and store in array
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        // Print the Fibonacci numbers
        for (int i = 0; i < fibonacciArray.length; i++) {
            System.out.println(fibonacciArray[i]);
        }
    }


}
