import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctionalInterfaceDemo {


    static Predicate<Integer> p = n -> check(n);
    static Function<Integer,Integer> f = n -> n+2;
    static Supplier<String> s = () -> "test string";
    static Consumer<String> c = n -> System.out.println("consumed: "+n);

    public static void main(String[] args) {
        System.out.println("p.test(2) = " + p.test(2));
        System.out.println("f = " + f.apply(2));
        System.out.println("s.get() = " + s.get());
        c.accept("hello consumer");
    }

    static boolean check(int nbr){
        return true;
    }


}
