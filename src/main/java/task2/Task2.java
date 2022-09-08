package task2;

/* Task2

    [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("===================Solution Task 2===================");
        System.out.println(Arrays.toString(solutionTask2(new int[]{3, 4, 2, 7}, 10)));
    }

    static int[] solutionTask2(int[] source, int sum) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            if (map.containsKey(sum - source[i])) {
                result[0] = sum - source[i];
                result[1] = source[i];
                return result;
            }
            map.put(source[i], i);
        }
        return null;
    }
}
