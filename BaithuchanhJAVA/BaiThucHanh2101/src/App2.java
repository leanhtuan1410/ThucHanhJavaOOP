import java.util.Scanner;
public class App2 
{

    public static void main(String[] args) throws Exception
    {
        double a1, b1, c1, a2, b2, c2;
        double Dx, Dy, D;
        try (Scanner scanner = new Scanner(System.in))
         {
            System.out.println("Nhap a1: ");
            a1 = scanner.nextDouble();
            System.out.println("Nhap b1: ");
            b1 = scanner.nextDouble();
            System.out.println("Nhap c1: ");
            c1 = scanner.nextDouble();
            System.out.println("Nhap a2: ");
            a2 = scanner.nextDouble();
            System.out.println("Nhap b2: ");
            b2 = scanner.nextDouble();
            System.out.println("Nhap c2: ");
            c2 = scanner.nextDouble();
    }
    Dx = c1 * b2 - c2 * b1;
    Dy = a1 * c2 - a2 * c1;
    D = a1 * b2 - a2 * b1;
    if (D==0) 
    {
        if (Dx + Dy == 0)
            System.out.println("He phuong trinh co vo so nghiem ");
        else
            System.out.println("He phuong trinh vo nghiem ");
    }                           
    else {
        double x = Dx /D;
            System.out.println("x =" +x);
        double y = Dy /D;
            System.out.println("y =" +y);
    }
}
}