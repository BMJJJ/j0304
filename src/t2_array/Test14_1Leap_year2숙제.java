package t2_array;

import java.util.Scanner;
//년도와 달을 입력하면 해당년도 월의 마지막 일자를 출력하는 프로그램을 완성하시오.
//윤년? 1.4로 나눠떨어지면 윤년? 2.100으로 나눠떨어지면 평년? 3.이 년도가 400으로 나눠떨어지면 윤년이다.
public class Test14_1Leap_year2숙제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day=0;
		
		System.out.print("년도를 입력하세요? ");
		int year = sc.nextInt();
		System.out.println("달을 입력하세요?");
		int month = sc.nextInt();
		
		for(int i =0; i<12; i++) {
			for(int j=0; j<31; j++) {
				if((year % 400) == 0 || ((year % 4) != 0 || (year % 100) != 0));
				
			}
		}
		
		//if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
			
			System.out.println(year + " 은 윤년이고 "+month +"는 이고 "+day+"일입니다.");
		sc.close();		
	}
}
