import java.util.Scanner;

public class chapter1_3 {

	public static void main(String[] args) {
		Scanner birth = new Scanner(System.in);
		int date = birth.nextInt();
		int day = date % 100;
		int mid = date / 100;
		int month = mid % 100;
		int year = mid / 100;
		System.out.print(year + "년 " + month + "월 " + day + "일");

	}

}
