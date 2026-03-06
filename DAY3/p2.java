import java.util.*  ;
import java.util.stream.*;
public class p2{
    public static void main(String[] args){
        List<String>input=Arrays.asList("naimisha"," ","nani");
        input.stream().filter(s->!s.isBlank()).forEach(System.out::println);
    }
}

