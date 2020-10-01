package Lab1_Lab2;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.	Giải phương trình bậc nhất");
		System.out.println("2.	Giải phương trình bậc 2");
		System.out.println("3.	Tính tiền điện");
		System.out.println("4.	Kết thúc");
		System.out.println("+---------------------------------------------------+");
		
		int a=sc.nextInt();
		switch(a)
		{
		case 1: phuongTrinhBac1();
		case 2: phuongTrinhBac2();
		case 3: tinhTienDien();
		case 4: System.exit(0);
		}
	}
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
