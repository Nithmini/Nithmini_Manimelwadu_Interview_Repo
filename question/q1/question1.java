package q1;
public class question1 {

        public static void main(String[] args) {
            // for-loop
            int[] number = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                sum += number[i];  // Corrected operator
            }
            System.out.println("sum: " + sum);
        }
    }

