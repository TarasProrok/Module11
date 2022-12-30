import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Module11Application {
    //Task 1 and 2 params
    private static List<String> names = Arrays.asList("Sam", "Pamela", "Dave",
            "Pascal", "Erik", "Lana", "Taras", "Vika", "Ania", "Alex", "Ivanna", "Alina");
    //Task 3 params
    private static String[] numbers = {"1, 2, 0", "4, 5"};

    //Task 5 params
    private static Stream<String> first = Arrays.stream(new String [] {"Sam", "Pamela", "Dave",
            "Pascal", "Erik", "Lana", "Taras"});
    private static Stream <String> second = Arrays.stream(new String [] {"A", "B", "C", "D", "E", "F", "G", "H"});

    public static void main(String[] args) {
        //Task 1
        System.out.println(OddNames.allNames(names));
        System.out.println(OddNames.nameSorter(names));
        System.out.println("-----");
        //Task 2
        System.out.println(ReversingNames.allNames(names));
        System.out.println(ReversingNames.upperCaseAndBackSorted(names));
        System.out.println("-----");
        //Task 3
        System.out.println(Arrays.toString(numbers));
        System.out.println(RearengeNumbersFromStreamInAscend.ascendNumbers(numbers));
        System.out.println("-----");
        //Task 4
        EndlessRand.EndlessStreamOfRandomNumbers();
        System.out.println("-----");
        //Task 5
        StreamShuffler.zip(first, second);
    }
}
