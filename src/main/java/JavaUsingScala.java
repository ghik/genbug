import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ghik
 * Date: 04.04.13
 * Time: 23:01
 */
public class JavaUsingScala {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = Test.exampleGenericMethod(list);
    }
}
