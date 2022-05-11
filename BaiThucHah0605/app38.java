import java.Util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<String> list = new  LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        
        System.out.println("vi du su dung phuong thuc addAll() ");
        System.out.println("------------------------------");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
    }
}