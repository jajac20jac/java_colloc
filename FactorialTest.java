import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial f = new Factorial();

    @Test
    public void factTest(){
        assert(f.fact(0) == 1);
        assert(f.fact(1) == 1);
        assert (f.fact(4) == 24);
    }

    @Test
    public void nfactTest(){
        List<Long> llist = new ArrayList<>();
        llist.add(1L);
        llist.add(2L);
        assert (f.nfact(2) == llist);
    }
}