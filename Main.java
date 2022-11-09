import java.util.List;

public class Main {
    public static void main(String[] args){

        long n = Factorial.fact(4);
        List<Long> testi = Factorial.nfact(5);
        System.out.println(n);
        System.out.println(testi.get(2));
    }
}
