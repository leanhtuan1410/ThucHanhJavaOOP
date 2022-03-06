import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
    int a,giaithua=1;
    Scanner scanner = new Scanner(System.in);
	do {
	System.out.print("Nhap vao mot so nguyen duong: ");
	a=sc.nextInt();
	}
	while(a<=0);
	for(int i=2;i<=a;i++)
	{
	giaithua=giaithua*i;
	}
	System.out.println("Giai thua cua so " +a+ " la: "+giaithua);
    } 
}