import java.util.*;

public class OddNames {
        private static List<String> names = Arrays.asList("Sam", "Pamela", "Dave",
                "Pascal", "Erik", "Lana", "Taras", "Vika", "Ania", "Alex", "Ivanna", "Alina");
    private static StringBuilder nameSorter(List<String> names){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<names.size();i++) {
            if (i%2 != 0) {
                result.append(i).append(". ").append(names.get(i)).append(" ");
            }
        }
        return result;

    }
        private static List <String> upperCaseAndBackSorted (List<String> names) {
                Collections.sort(names);
                Collections.reverse(names);
                names.replaceAll(String::toUpperCase);
                return names;
        }
    public static void main(String[] args) {
        nameSorter(names);
        System.out.println(nameSorter(names));
        upperCaseAndBackSorted(names);
        System.out.println(upperCaseAndBackSorted(names));
    }
}