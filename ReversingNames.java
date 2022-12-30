import java.util.Collections;
import java.util.List;

public class ReversingNames {
    public static List<String> upperCaseAndBackSorted(List<String> names) {
        Collections.sort(names);
        Collections.reverse(names);
        names.replaceAll(String::toUpperCase);
        return names;
    }
    public static StringBuilder allNames (List<String> names) {
        StringBuilder allNames = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            allNames.append(i).append(". ").append(names.get(i)).append(" ");
        }
        return allNames;
    }
}
