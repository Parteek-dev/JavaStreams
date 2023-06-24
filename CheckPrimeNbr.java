import entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPrimeNbr {

    public static void main(String[] args) {

        System.out.println("args = " + new CheckPrimeNbr().primeNbrJava8(17));
        System.out.println("using recursion = " + new CheckPrimeNbr().isPrime(17,2));
        System.out.println("using recursion2 = " + new CheckPrimeNbr().isPrime2(16,(int)Math.sqrt(16)));

        //print first 10 prime number
        IntStream.iterate(2,n->n+1).filter(new CheckPrimeNbr()::primeNbrJava8).limit(10).forEach(System.out::println);

    }

    //brute force
    public boolean checkPrimeNbr(int num){

        if (num < 2) {
         return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.println(Math.sqrt(num));
            if (num%i == 0)
                return false;
        }

        return true;
    }

    //using java 8
    public boolean primeNbrJava8(int num){

        if (num < 2)
            return false;

       return IntStream.rangeClosed(2,(int)Math.sqrt(num)).
              // peek( i -> System.out.println(i +" "+num%i)).//peek used to see elements
               noneMatch(i -> num%i == 0);
    }

    //Using Predicate
    public boolean usingPredicate(int num){

        Predicate<Integer> p = n -> {
            if(n < 2)
                return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                System.out.println(Math.sqrt(n));
                if (n%i == 0)
                    return false;
            }
            return true;
        };

        return p.test(num);
    }

    //using recursion
    public boolean isPrime(int nbr, int divisor){

        if(nbr <= 2)
            return false;
        if (nbr%divisor == 0)
            return false;
        if(divisor*divisor > nbr)
            return true;

        return isPrime(nbr,divisor+1);
    }

    //using recursion -  best way
    public boolean isPrime2(int nbr, int divisor){
        if(nbr <= 2)
            return false;
        if (nbr%divisor == 0)
            return false;
        else
            return isPrime(nbr,divisor-1);
    }
}