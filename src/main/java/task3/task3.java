package task3;
/*
Task3
Реализовать функцию нечеткого поиска

fuzzySearch("car", "ca6$$#_rtwheel"); // true
fuzzySearch("cwhl", "cartwheel"); // true
fuzzySearch("cwhee", "cartwheel"); // true
fuzzySearch("cartwheel", "cartwheel"); // true
fuzzySearch("cwheeel", "cartwheel"); // false
fuzzySearch("lw", "cartwheel"); // false
 */

import java.util.List;
import java.util.stream.Stream;

public class task3 {
    public static void main(String[] args) {
        System.out.println(task3("car", "ca6$$#_rtwheel"));
        System.out.println(task3("cwhl", "cartwheel"));
        System.out.println(task3("cwhee", "cartwheel"));
        System.out.println(task3("cartwheel", "cartwheel"));
        System.out.println(task3("cwheeel", "cartwheel"));
        System.out.println(task3("lw", "cartwheel"));
    }

    public static boolean task3(String target, String source) {
        List<String> listTarget = Stream.of(target.split("")).map(String::new).toList();
        List<String> listSource = Stream.of(source.split("")).map(String::new).toList();

        int indexTarget = 0;
        int indexSource = 0;

        while (indexSource < listSource.size() - 1) {
            if (listSource.get(indexSource).equals(listTarget.get(indexTarget))) {
                indexTarget++;
                indexSource++;
                if (indexTarget >= listTarget.size() - 1) {
                    return true;
                }
            } else {
                indexSource++;
            }
        }
        return false;
    }
}
