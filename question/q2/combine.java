package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combine {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<Object> combinedList = combineAlternating(list1, list2);

        System.out.println(combinedList);
    }

    public static List<Object> combineAlternating(List<String> list1, List<Integer> list2) {
        List<Object> result = new ArrayList<>();

        // Assuming both lists have the same size
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));  // Add element from list1
            result.add(list2.get(i));  // Add element from list2
        }

        return result;



}
}
