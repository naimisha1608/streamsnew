import java.util.*;
import java.util.stream.*;
class p1{
    public static void main(String[] args)
    {
        List<String> ll = Arrays.asList("naishu","Naishu","Nani",null);
        ll.stream().filter(Objects::nonNull).forEach(System.out::println);

    }
}