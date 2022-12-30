import java.util.*;

public class OddNames {
    public static StringBuilder nameSorter(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                result.append(i).append(". ").append(names.get(i)).append(" ");
            }
        }
        return result;
    }
    public static StringBuilder allNames (List<String> names) {
        StringBuilder allNames = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            allNames.append(i).append(". ").append(names.get(i)).append(" ");
        }
        return allNames;
    }
}