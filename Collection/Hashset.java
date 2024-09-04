package Collection;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
Set<String>hash=new HashSet<>();


hash.add("ishtiaque");
hash.add("mahmud");
hash.add("fahim");
hash.add("loves");
hash.add("Anika");
hash.add("Anika");
hash.remove("mahmud");



System.out.println(hash);
System.out.println(hash.contains("fahim"));
System.out.println(hash.contains("rafiq"));

for(String set:hash){
    System.out.println(set);
}


    }

}
