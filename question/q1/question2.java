package q1;
public class question2 {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;
        int i = 0;

        while(i < number.length){
            sum += number[i];
            i++;
        }

        System.out.println("sum: " + sum);
    }

}
