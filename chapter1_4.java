import java.util.Scanner;
public class chapter1_4 {

	public static void main(String[] args) {
		Scanner travel = new Scanner(System.in);
		int room = 0;
		int person = travel.nextInt();
		int date = travel.nextInt();
		int air_cost = travel.nextInt();
		int room_cost = travel.nextInt();
		if (person % 2 == 1) {
			room = person / 2 + 1;
		} else {
			room = person / 2;
		}
		int total_cost = air_cost * person + room_cost * room * date;
		
		System.out.print(person + "명의 일본 도쿄 " + date + "박 " + (date + 1) + "일 여행에는 " + room + "개 필요하며 경비는 " + total_cost + " 원 입니다.");

	}

}
