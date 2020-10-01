package Lab1_Lab2;
import java.util.*;

public class Phuong_Trinh_Bac_2 {

	public static void phuongTrinhBac2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("nhập hệ số thứ nhất: ");
		int a=scan.nextInt();
		System.out.print("nhập hệ số thứ hai: ");
		int b=scan.nextInt();
		System.out.print("nhập hệ số thứ ba: ");
		int c=scan.nextInt();
		
		double delta= (b*b)-(4*a*c);
		
		if(delta<0)
		{System.out.print("Pt vô nghiệm");}
		else if(delta==0)
		{
			float x1=-b/2*a;
			float x2=x1;
			System.out.printf("Pt có 2 nghiệm kép là: %.1f %.1f",x1,x2);
		}
		else
		{
			float x1=(float)(-b+(Math.sqrt(delta)))/(2*a);
			float x2=(float)(-b-(Math.sqrt(delta)))/(2*a);
			System.out.printf("Pt có 2 nghiệm là: %.1f %.1f",x1,x2);
		}
		
	}

}
