package t1_memory;

import java.util.Scanner;

public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; // 1: 계속, 0: 그만
		int cnt = 0;
		String ans= "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(Y:계속,N:그만)");
			ans = sc.next();
			if(ans.equals("N")) break; //==기본타입일때 값을비교 참조타입 일때는 equals를 사용해야 한다.
		}
		System.out.println("작업끝..");
		
		sc.close();
	}
}
