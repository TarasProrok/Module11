import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearengeNumbersFromStreamInAscend {
    public static List<String> ascendNumbers(String[] numbers) {
        String[] temp;
        List<Integer> numbersInInt = new ArrayList<>();
        List<String> numbersInString = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i].split(",\\s");
            numbersInString.addAll(List.of(temp));
        }
        for (String number : numbersInString) {
            numbersInInt.add(Integer.parseInt(number));
        }
        Collections.sort(numbersInInt);
        List<String> result = new ArrayList<>(numbersInInt.size());
        for (Integer myInt : numbersInInt) {
            result.add(myInt.toString());
        }
        return result;
    }

}
