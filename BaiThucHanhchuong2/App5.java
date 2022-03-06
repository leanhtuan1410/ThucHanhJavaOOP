import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
    int n ,sum =0;
    Scanner scanner = new Scanner(System.in); 
        do{
             System.out.print("Nhap so : ");
	     n=sc.nextInt();
	     sum+=n;
        }
      while( sum < 100);
		System.out.println("Tong cac so la : "+sum);
    }    
}