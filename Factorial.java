import java.util.ArrayList;
import java.util.List;
//класс заменяет facade dp
public class Factorial {
    public static long fact(int n){
        long fin = 1;
        for (int i = 1; i <= n; i++){
            fin *= i;
        }
    return fin;
    }

    public static List<Long> nfact(int n){
        List<Long> ex = new ArrayList<>();
        long fin = 1;
        for (int i = 1; i <= n; i++){
            fin *= i;
            ex.add(fin);
            System.out.println(fin);
        }
        return ex;
    }
}
