package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		int minNumber = 1;
		int maxNumber = 100;
		int count = 0;
		int number;
		
		Scanner scanner = new Scanner( System.in );
		
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + 1;
		//System.out.println(correctNumber);
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요!");
		System.out.println(minNumber + "-" + maxNumber);
		
		while(true) {
			System.out.print(++count + ">>");
			number = scanner.nextInt();
			
			if(number == correctNumber) {
				System.out.println("맞추셨습니다.");
				System.out.print("다시하시겠습니까?(y/n)>>");
				
				String answer = scanner.next();
				if(answer.equals("n")) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				else {
					correctNumber = random.nextInt(maxNumber) + 1;
					System.out.println(correctNumber);
					count = 0;
					maxNumber = 100;
					minNumber = 1;
					continue;
				}
			}
			
			else {
				
				if(number < correctNumber) {
					minNumber = number;
					System.out.println("더 높게");
					System.out.println(minNumber + "-" + maxNumber);
				}
				
				else if(number > correctNumber) {
					maxNumber = number;
					System.out.println("더 낮게");
					System.out.println(minNumber + "-" + maxNumber);
				}
			}
				
		}
		
		
		scanner.close();
	}

}