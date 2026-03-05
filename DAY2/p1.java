import java.util.*;
import java.util.stream.*;

class p1{
    public static void main(String[] args)
    {
        List<String> ll = Arrays.asList("naishu","Naishu","Nani");

        ll.stream()
          .map(String::toLowerCase)
          .forEach(System.out::println);
    }
}