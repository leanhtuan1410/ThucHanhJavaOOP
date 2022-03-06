import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{ 
          System.out.print("Nhap vao so phan tu cua mang :");
          n=sc.nextInt();
          
        } while(n<0);
        
        int mang[]= new int[n];
        System.out.println("Nhap vao cac phan tu cua mang :");
        for(int i=0;i<n;i++){
        System.out.print("Nhap phan tu thu " + i + ":");
        mang[i]=sc.nextInt();
        }
        double sum=0;
        for (int i=0 ;i<n;i++){
            if(mang[i]%2==0){
                sum+=mang[i];
            }
        }
        System.out.print("Tong :" +sum);
                
        }   
    }
