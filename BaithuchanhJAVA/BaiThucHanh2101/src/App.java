import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception{
        double a, b, c, delta;
        double x1, x2;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap a: ");
            a = scanner.nextDouble();
            System.out.println("Nhap b: ");
            b = scanner.nextDouble();
            System.out.println("Nhap c: ");
            c = scanner.nextDouble();
        }
        System.out.println("Phuong trinh bac 2 co dang :"+a+"x^2  "+b+"x + "+c+" = 0");
        delta = b *b - 4 *a *c;
        if (delta == 0) {
            x1 = x2 = -b /(2 *a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+x1 );
        }
        else if (delta < 0){
            System.out.println("Phuong trinh vo nghiem ");
        }
        else {
            x1 = (-b + Math.sqrt(delta)) /(2 *a);
            x2 = (-b - Math.sqrt(delta)) /(2 *a);
            System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2 );

        }
    }
}