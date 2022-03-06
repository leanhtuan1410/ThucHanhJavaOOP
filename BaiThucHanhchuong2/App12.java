import java.util.Scanner;

public class App12 {
public static void main(String[] args) {  
int socot, sodong; 
Scanner sc = new Scanner(System.in);
System.out.print("\nSo dong cua ma tran : ");
sodong = scanner.nextInt();
System.out.print("\nSo cot cua ma tran : ");
socot = scanner.nextInt();
int a[][] = new int[sodong][socot];
for (int i = 0; i < sodong; i++) {
    for (int j = 0; j < socot; j++) {
        System.out.print("a[" + i + "]["+ j + "] = ");
        a[i][j] = scanner.nextInt();
    }
}
int max = a[0][0];
    for (int i = 0; i < sodong; i++) {
        for (int j = 0; j < socot; j++) {
            if (max < a[i][j]) {
                max = a[i][j];
        }
        }
        }
    System.out.println("So lon nhat trong ma tran la : " + max);
    }    
}