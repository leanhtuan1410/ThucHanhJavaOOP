import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int a,b,tong,hieu,du,min=0,thuong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a :");
        a=sc.nextInt();
        System.out.print("Nhap b :");
        b=sc.nextInt();
        tong=a+b;
        System.out.print("Tong cua a va b :"+tong);
        if(a>b)
        {
            hieu=a-b;min=b;
            System.out.print("\nHieu cua a va b : "+hieu);
            if(b!=0)
            {
            thuong=a/b;du=a%b;
            System.out.print("\nThuong cua a va b :"+thuong);
            System.out.print("\nSo du chua phep chia a va b :"+du);
            }
            else {System.out.print("\nKhong thuc hien duoc phep chia");}
            System.out.print("\nSo lon la : "+a);
            System.out.print("\nSo be la : " +b);
        }
        else  
        { 
            hieu=b-a;min=a;
            if(a!=0)
            {
            thuong=b/a;du=b%a;
            System.out.print("\nThuong cua phep chia a va b la :"+thuong);
            System.out.print("\nSo du chua phep chia a va b la :"+du);
            }
            else {System.out.print("\nKhong thuc hien duoc phep chia");}
            System.out.print("\nSo lon la : "+b);
            System.out.print("\nSo be la : " +a);
        }
    
}
}