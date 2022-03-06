import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao mot chuoi bat ky :");
	String chuoi=sc.nextLine();
	int demso = 0, demkytuhoa =0, demkytuthuong = 0;
	System.out.print("\nChuoi vua nhap : " +chuoi);
	int dodai = chuoi.length();
	for(int i=0;i<dodai;i++)
	{
	if(Character.isUpperCase(chuoi.charAt(i)))
	{
	demkytuhoa++;
	}
	if(Character.isLowerCase(chuoi.charAt(i)))
	{
	demkytuthuong++;
	}
	if(Character.isDigit(chuoi.charAt(i)))
	{
	demso++;
	}
	}
	System.out.print("\nCo "+demkytuhoa+" ki tu in hoa");
	System.out.print("\nCo "+demkytuthuong+" ki tu thuong");
	System.out.print("\nCo "+demso+" ki tu so");
    }    
}