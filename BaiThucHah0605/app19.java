import java.Util.ArrayList;
import java.Util.ListIterator;

public class  ArrayList {
    public static void main(Strings[]  args) {

        ArrayList<Character> arrListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');

        ListIterator<Character> listIterator = arrayListChar.listIterator();

        System.out.println("Cac phan tu co trong arrListChar la: ");
        wwhile (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }

    }
}