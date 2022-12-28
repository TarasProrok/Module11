import java.util.function.Function;
import java.util.stream.Stream;

public class OddNames <E> {
    private int index;
    private E value;

    public OddNames(int index, E value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public E getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + ". " + index;
    }

    public static <E> Function<E, OddNames<E>> indexed() {
        return new Function<E, OddNames<E>>() {
            int index = 1;

            @Override
            public OddNames<E> apply(E e) {
//                index++;
                return new OddNames<>(index++, e);
            }
        };
    }
}

class OddNamesApplication {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Sam", "Pamela", "Dave", "Pascal", "Erik", "Lana", "Taras", "Vika");
        stream.map(OddNames.indexed()).forEachOrdered(e -> {
            System.out.println(e.getIndex() + ". " + e.getValue());
        });
    }
}