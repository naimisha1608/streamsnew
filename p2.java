import java.util.*;
import java.util.stream.Collectors;
public class p2
{
    public static void main(String[] args)
    {
        List<Integer> ll=Arrays.asList(1,2,3,10,30,20,40,50);
        List<Integer>ss=ll.stream().filter(n->n>=50).collect(Collectors.toList());
        System.out.println(ss);
    }
}