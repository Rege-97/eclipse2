import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재 월을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을 입니다.");
			break;
		default:
			System.out.println("현재의 계절은 겨울 입니다.");

		}
	}

}
