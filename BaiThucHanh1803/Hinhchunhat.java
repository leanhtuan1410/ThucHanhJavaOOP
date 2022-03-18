import.Java.util.Scanner;

public class Hinhchunhat{
    public static void main (String []args) {
        int chieudai, chieurong,  chuvi, dientich;
        Hinhchunhat hinhchunhat = new Hinhchunhat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
            chieudai = Scanner.nextInt;
        System.out.println("Nhap vao chieu rong: ");
            chieurong = Scanner.nextInt ; 
    }
    public int chuvi(){
        chuvi = 2 * (chieudai + chierong);
        return chuvi;
    }
    public int dientich(){
        dientich = chieudai  * chieurong;
        return dientich;

    }
    
}