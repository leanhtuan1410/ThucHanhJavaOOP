import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExp1 {
    public static void main(String[] args){


Set<String> LinkedHashSet = new LinkedHashSet<String>();
linkedHashSet.add("Java");
linkedHashSet.add("C++");
linkedHashSet.add("Java");
linkedHashSet.add("PHP");

for (String str : linkedHashSet) {
    System.out.println(str);
        }
    }

}