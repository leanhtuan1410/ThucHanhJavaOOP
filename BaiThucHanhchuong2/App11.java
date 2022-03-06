import java.util.Scanner;

public class App11 {
public static void main(String[] args) {
int a,b;
Scanner scanner =new Scanner(System.in);
int mang[] = new int[100];
    do {
        System.out.print("\nNhap vao so phan tu cua mang : ");
        a = sc.nextInt();
        } while (a < 2 || a > 100);
        for (int i = 0; i < a; i++) {
        System.out.print("\nSo thu[" + i + "] = ");
        mang[i] = sc.nextInt();
        }
        System.out.print("\nMang vua nhap la : ");
        for (int i = 0; i < a; i++) {
            System.out.print(mang[i] + " ");
        }
        for (int i = 0; i < a - 1; i++) {
            for (int j = i+1; j <= a - 1; j++) {
                if (mang[j] < mang[i]) {
                    b = mang[i];
                    mang[i] = mang[j];
                    mang[j] = b;
                }
            }
        }
        System.out.print("\nMang sau khi sap xep: ");
        for (int i = 0; i < a; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}