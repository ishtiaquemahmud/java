package Collection;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer>a=new HashMap<>();

        a.put("fahim",1691);
        a.put("omim",1891);
        a.put("tausif",1711);

        System.out.println(a);
        System.out.println(a.get("fahim"));

        System.out.println(a.containsKey("ff"));
        System.out.println(a.containsValue(1691));


        a.put("omim",1691);

        System.out.println(a);

        


        
    }

}
