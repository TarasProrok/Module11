import java.util.stream.Stream;

public class EndlessRand {
    private static Long methodToPower(Long baseToPower, int power) {
        Long result = 1L;
        while (power != 0) {
            result = result * baseToPower;
            power--;
        }
        return result;
    }
    private static Long next(Long n) {
        Long a = 25214903917L;
        int c = 11;
        n = 1* (a * n + c) % methodToPower(2L,48);
        return n;
    }
    private static void EndlessStreamOfRandomNumbers() {
        Long Sd = 1L;
        Stream.iterate(Sd, n -> next(n))
                .limit(10)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        EndlessStreamOfRandomNumbers();
    }
}
