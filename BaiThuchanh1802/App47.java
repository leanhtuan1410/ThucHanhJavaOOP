import java.util.Scanner;

public class App47 {
    public static void main(String[] args) {
    int tong = 0, n;
    Scanner sc = new Scanner(System.in);
         
    do {
        System.out.println("Nhap so nguyen n bat ky:");
        n = scanner.nextFloat();
        tong += n;
             
        if (tong > 100)
            break;
    } while (n > 0);
         
    System.out.println("Tong so nguyen n vua nhap = " + tong);
}
}