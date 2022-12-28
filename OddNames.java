import java.util.*;

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

    private static void ascendNumbers(String[] numbers) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i - " + i + " val - " + numbers[i]);
        }
        System.out.println("-----");
        String[] temp1 = numbers[0].split(",\\s");
        String[] temp2 = numbers[1].split(",\\s");

        System.out.println("temp1 " + Arrays.toString(temp1));
        System.out.println("temp2 " + Arrays.toString(temp2));
        System.out.println("-----");

        String[] temp = null;
        List<Integer> fuckingNumbers = new ArrayList<>();
        List<String> newNumberList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i].split(",\\s");
            newNumberList.addAll(List.of(temp));
        }
        System.out.println("Merging done!");
        System.out.println("Size is " + newNumberList.size());
        System.out.println(newNumberList);
        System.out.println("-----");

        for (String number : newNumberList) {
            fuckingNumbers.add(Integer.parseInt(number));
        }
        Collections.sort(fuckingNumbers);
        System.out.println(fuckingNumbers);
        System.out.println("Sorting done!");
        System.out.println("-----");
        System.out.println("Converting to String");
        List<String> result = new ArrayList<>(fuckingNumbers.size());
        for (Integer myInt : fuckingNumbers) {
            result.add(myInt.toString());
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
//        nameSorter(names);
//        System.out.println(nameSorter(names));
//        upperCaseAndBackSorted(names);
//        System.out.println(upperCaseAndBackSorted(names));
        ascendNumbers(numbers);
    }
}