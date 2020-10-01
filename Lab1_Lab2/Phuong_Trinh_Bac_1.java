package Lab1_Lab2;
import java.util.*;

public class Phuong_Trinh_Bac_1 {
	
	public static void phuongTrinhBac1() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap vào hệ số thứ nhất: ");
		float a=sc.nextFloat();
		System.out.print("Nhap vào hệ số thứ hai: ");
		float b=sc.nextFloat();
		
		if(a==0)
		{ 
			if(b==0)
			{System.out.print("Phương trình vô số nghiệm");}
			else
			{System.out.print("Thông báo vô nghiệm");}
		}
		else
		{
			System.out.print("Nghiệm của phương trình là: "+(float)(-b/a));
		}
	}

}
