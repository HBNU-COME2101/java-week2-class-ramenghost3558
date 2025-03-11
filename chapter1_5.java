import java.util.Scanner;
public class chapter1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age <= 0) {
			System.out.print("나이는 양수로만 입력하세요");
		} else {
		int red = age / 10;
		int leave = age % 10;
		int blue = leave / 5;
		int yellow = age - red * 10 - blue * 5;
		
		System.out.print("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + (red + blue + yellow) + "개가 필요합니다");
		}
		

	}

}
