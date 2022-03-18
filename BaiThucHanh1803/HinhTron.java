import.java.util.Scanner;

public class HinhTron{
    double r;
    double ChuVi;
    double DienTich;
    final double PI = 3.14;
    public static double tinhDienTich(double r) {
    return r * r * r;
}
public static double tinhChuVi(double r){
    return r * 2 * r;
}
public static void main(String[] args) {
    double r;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap ban kinh hinh tron: ");
    r = scanner.nextDouble();
    System.out.println("Dien tich hinh tron: " + DienTich(r));
    System.out.println("Chu vi hinh tron: "+ ChuVi(r));     
    }
}
