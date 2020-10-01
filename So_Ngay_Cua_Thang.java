package Lab1_Lab2;
import java.util.*;

public class So_Ngay_Cua_Thang {

	public static void NgayThang(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);// Call Scanner 
		System.out.print("Nhập vào số tháng: ");
		int a=sc.nextInt();
		System.out.print("Nhập vào năm: ");
		int b=sc.nextInt();
		
		switch(a)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:System.out.print("Số ngày trong tháng "+a+" năm "+b+" là: 31 ngày");break;
		case 2: if(b%4==0) {System.out.print("Số ngày trong tháng "+a+" năm "+b+" là: 29 ngày");break;} else {System.out.print("Số ngày trong tháng "+a+" năm "+b+" là: 28 ngày");break;}
		case 4: case 6: case 9: case 11:System.out.print("Số ngày trong tháng "+a+" năm "+b+" là: 30 ngày");break;
		default: System.out.print("Bạn vừa nhập sai số tháng");break;
		}
	}

}
