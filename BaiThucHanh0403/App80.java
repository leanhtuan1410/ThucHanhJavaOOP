import java.util.Scanner;

public class App80 {
    public static void main(String[] args) {
    int sodong, socot;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao so dong cua ma tran :");
    sodong=sc.nextInt();
    System.out.print("Nhap vao so cot cua ma tran :");
    socot=sc.nextInt();
    int [][]mt= new int[sodong][socot];
    System.out.println("Nhap vao cac phan tu cua ma tran :");
    
    for(int i=0;i<sodong;i++)
        for(int j=0;j<socot;j++)
                {
                System.out.print("mt[" +i+ "]["+j+"]=");
                mt[i][j]=sc.nextInt();
                }
    int max=mt[0][0];
    for (int i=0;i<sodong;i++)
        for(int j=0;i<socot;j++)
        {
            if(max<mt[i][j]){
                max=mt[i][j];
            }
        }
    System.out.println("Phan tu lon nhat cua ma tran  la :" + max);
    }    
}