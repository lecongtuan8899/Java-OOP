package Lab1_Lab2;
import java.util.*;

public class Tinh_Tien_Dien {

	public static void tinhTienDien() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào số điện: ");
		float a=sc.nextFloat();
		
		if(a>=0&&a<=50)
		{
			System.out.print("Số ti�?n điện của tháng là: "+(a*1000));
		}
		else
			System.out.print("Số ti�?n điện của tháng là: "+(50*1000+(a-50)*1200));
	}

}
