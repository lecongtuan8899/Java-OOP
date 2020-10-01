package Lab1_Lab2;
import java.util.*;

public class So_Duong_Can_Bac_2 {

	public static void SoDuong(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số bất kỳ: ");
		int a = sc.nextInt();
		if(a>=0)
		{
			System.out.printf("Căn bậc 2 của số vừa nhập là: %.3f",Math.sqrt(a));
		}
		else
			System.out.print("Hãy nhập số dương!");

	}

}
