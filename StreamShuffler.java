import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamShuffler {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        List<T> result = new ArrayList<>();
        for (int i = 0; i < Math.min(firstList.size(),secondList.size()); i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        Stream<T> resultStream = result.stream();
                resultStream.forEach(System.out::println);
        return resultStream;
    }
}
