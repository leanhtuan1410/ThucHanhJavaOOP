import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap n : ");
    n=sc.nextInt();
    int arr[]=new int [n];
    double sum=0,tbc;
    for(int i=0;i<n;i++)
    {
	System.out.print("Nhap so "+ i +" :");
        arr[i]=sc.nextInt();
	}
    for(int i=0;i<n;i++)
	{
	sum=sum+arr[i];
	}
        tbc=sum/n;
	System.out.println("Trung binh cong cua cac so la: "+ tbc);
	
    }
}