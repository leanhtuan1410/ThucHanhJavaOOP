import java.Util.Scanner;

public class Point {
    String tendiem;
    float hoanhdo, tungdo;
    Scanner sc=new Scanner(System.in);
public void point(){    
}
public void point(String tendiem,float x,float y){
    this.tendiem=tendiem;
    this.hoanhdo =x;
    this.tungdo=y;
}
public void nhapdiem(){
    System.out.print("\n Nhap ten diem : ");
    tendiem=sc.nextLine();
    System.out.print("Nhap hoanh do : ");
    hoanhdo=sc.nextFloat();
    System.out.print("Nhap tung do : ");
    tungdo=sc.nextFloat();
}
public void indiem(){
    System.out.print( tendiem + "("+hoanhdo+","+tungdo+");");
}
}