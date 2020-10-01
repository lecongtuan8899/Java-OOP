package Lab1_Lab2;
import java.util.*;

public class Tinh_Thue {

	public static void Thue(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập số ti�?n lương: ");
		int a=sc.nextInt();
		System.out.print("Nhập số ti�?n thưởng: ");
		int b=sc.nextInt();
		int c=a+b;
		
		if(c<9000000)
		{System.out.print("Thuế phải đóng là: 0vnđ");}
		else if(c>=9000000&&c<=15000000)
		{System.out.printf("Thuế phải đóng là: %f",(float)((a+b)*10/100));}
		else if(c>=15000000&&c<=30000000)
		{System.out.printf("Thuế phải đóng là: %f",(float)((a+b)*15/100));}
		else if(c>30000000)
		{System.out.printf("Thuế phải đóng là: %f",(float)((a+b)*20/100));}

	}

}
