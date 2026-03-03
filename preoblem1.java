
import java.util.*;
import java.util.stream.Collectors;

public class preoblem1 {
    public static void main(String[] args) {

        List<String> ll = Arrays.asList("null", "naimisha", "naishu", null);

        List<String> ss = ll.stream()
                            .filter(Objects::nonNull)
                            //.filter(n->n!=null)
                            .collect(Collectors.toList());
                     
        System.out.println(ss);
    }
}