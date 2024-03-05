package t3_exam;

//1~45숫자중 6개의 수를 추출후 정렬해서 출력시켜보자(중복배제)
public class Test6_lotto2숙제 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i =0; i<lotto.length; i++) {
			int su = (int)(Math.random()*45)+1;
			lotto[i] = su;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; //중복된 숫자가 나오면 전열로 돌아간다.
					break;					
				}
			}
		}
		
		//6개의 로또 번호를 정렬해서 출력
		int temp =0;
		for(int i=1;i<=5;i++) {
			for(int j=i+1; j<=6;j++) {
				if(lotto[i-1] > lotto[j-1]) {
					temp = lotto[i-1];
					lotto[i-1] = lotto[j-1];
					lotto[j-1] = temp;
							
				}
			}
		}
		
		System.out.println("이번주 번호는?");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " / ");
		}
	}
}
