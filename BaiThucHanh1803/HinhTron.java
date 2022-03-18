import.java.util.Scanner;

public class HinhTron{
    double r;
    final double PI = 3.14f;
    public static double tinhDienTich(double r) {
    return r * r * 3.14f;
}
    public static double tinhChuVi(double r){
    return r * 2 * 3.14f;
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
