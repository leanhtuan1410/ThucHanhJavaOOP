import java.Util.Scanner;

public class Tamgiac extends Point{
  
    point d1=new Point();
    point d2=new Point();
    point d3=new Point();
    public void tamgiac(){        
    }
    public void nhap(){   
    System.out.print("Nhap diem 1 :");
    d1.nhapdiem();
    System.out.print("Nhap diem 2:");
    d2.nhapdiem();
    System.out.print("Nhap diem 3:");
    d3.nhapdiem();
    System.out.print("Cac diem vua nhap la :" );
    d1.indiem(); d2.indiem(); d3.indiem();
    }
    public void check(){
    float c1=(float)Math.sqrt((d1.hd-d2.hd)*(d1.hd-d2.hd)+(d1.td-d2.td)*(d1.td-d2.td));
    float c2=(float)Math.sqrt((d1.hd-d3.hd)*(d1.hd-d3.hd)+(d1.td-d3.td)*(d1.td-d3.td));
    float c3=(float)Math.sqrt((d3.hd-d2.hd)*(d3.hd-d2.hd)+(d3.td-d2.td)*(d3.td-d2.td));
    if(c1+c2>c3||c1+c3>c2||c2+c3>c1){
        if(c1*c1+c2*c2==c3*c3||c1*c1+c3*c3==c2*c2||c2*c2+c3*c3==c1*c1){
            System.out.print("\nTam giac vuong.");
        }
        else
        {
            if(c1==c2&&c2==c3){
                System.out.print("\nTam giac deu.");
            }
            else
            {
                if(c1==c2||c1==c3||c2==c3){
                    System.out.print("\nTam giac can.");
                }
                else                    
                    System.out.print("\nTam giac thuong.");                    
            }
        }
    }
    else{
        System.out.print("\nKhong tao ra tam giac.");
    }
    }
    }