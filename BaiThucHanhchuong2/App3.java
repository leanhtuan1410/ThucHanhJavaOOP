import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int namsinh,tuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam : ");
        namsinh = sc.nextInt();
        tuoi=2022-namsinh;
            if(tuoi<16){
                System.out.print("\nBan " + ten + " dang o do tuoi vi thanh nien");
            }
            else if(tuoi>=16 && tuoi<18){
                System.out.print("\nBan " + ten + " dang o do tuoi truong thanh");
            }
            else
                System.out.print("\nban " + ten + " da gia");
        
    }    
}
