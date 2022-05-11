System.out.println("nvi du su dung phuong thuc retainAll()");
System.out.println("-----------------------------------");

LinkedList<String> listB = new LinkedList<String>();
listB.add("Java");

listA.retainAll(listB);
System.out.print("listA:");
showList(listA);

System.out.println("\nvi du su dung phuong thuc removeAll()");
System.out.println("--------------------------------------");

list.removeAll(listB);
System.out.print("list:");
showList(list);
}
public static void showList(LinkedList<String> list){

    for (String obj : list){
        System.out.print("\t" + obj + ", ");

    }
    System.out.println();
}
}