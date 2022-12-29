import java.util.*;
import java.util.stream.Stream;

public class OddNames {
    private static List<String> names = Arrays.asList("Sam", "Pamela", "Dave",
            "Pascal", "Erik", "Lana", "Taras", "Vika", "Ania", "Alex", "Ivanna", "Alina");
    private static String[] numbers = {"1, 2, 0", "4, 5"};

    private static StringBuilder nameSorter(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                result.append(i).append(". ").append(names.get(i)).append(" ");
            }
        }
        return result;
    }
    private static List<String> upperCaseAndBackSorted(List<String> names) {
        Collections.sort(names);
        Collections.reverse(names);
        names.replaceAll(String::toUpperCase);
        return names;
    }
    private static List<String> ascendNumbers(String[] numbers) {
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

    public static void main(String[] args) {
        nameSorter(names);
        System.out.println(nameSorter(names));
        upperCaseAndBackSorted(names);
        System.out.println(upperCaseAndBackSorted(names));
        ascendNumbers(numbers);
        System.out.println(ascendNumbers(numbers));
    }
}