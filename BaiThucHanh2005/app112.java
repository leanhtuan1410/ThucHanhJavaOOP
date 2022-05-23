import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

   public class app112 {
       public static void main(String[] args) {
         class SinhVien {
    
       public String hoTen;
       public int Diem;
   }
    
           Scanner input = new Scanner(System.in);
           System.out.println("Nhap so sinh vien: ");
           int n = input.nextInt();
    
           ArrayList<SinhVien> danhSach = new ArrayList();
    
           for (int i = 0; i < n; i++) {
               input.nextLine();
               SinhVien x = new SinhVien();
               System.out.println("Sinh vien thu " + i + "la :");
               System.out.print("Name: ");
               x.hoTen = input.nextLine();
               System.out.print("Diem: ");
               x.diem = input.nextInt();
               danhSach.add(x);
           }
                System.out.println("------------------------------------------------");
           for (int i = 0; i < danhSach.size(); i++) {
               System.out.println("Ten " + danhSach.get(i).hoTen + " ; Diem : " + danhSach.get(i).diem);
           }
       }
    }