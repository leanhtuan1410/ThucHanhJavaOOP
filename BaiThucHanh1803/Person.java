import java.util.Scanner;
public class Person {
    Scanner scanner = new Scanner(System.in);
    private String PersonID;
    private String PersonName;
    private String Address;
    private String Gender;
    public Person(){

    }
    public Person(String PersonID,String PersonName,String Address,String Gender){
        this.PersonID = PersonID;
        this.PersonName = PersonName;
        this.Address = Address;
        this.Gender = Gender;
    }
    public void Nhap(){
        System.out.println("Nhap ma ID: ");
        PersonID = scanner.nextLine();
        System.out.println("Nhap ho va ten: ");
        PersonName = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        Address = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gender = scanner.nextLine();
    }
    public void In(){
        System.out.printf("6%s 10%s 20%s 10%s \n","Ma ID","Ho va Ten","Dia chi","Gioi tinh");
    }
    public static void main(String[] args) throws Exception{
        Person person = new Person();
        person.Nhap();
        person.In();
    }  
}