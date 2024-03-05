package t3_exam;

//배열 이용한 369 게임
//3짝 짝짝 34 35 짝짝
public class Test2_369게임 {
	public static void main(String[] args) {
		String[] num = new String[100];//null로 초기값이 들어감
		int sw ;
		String temp;
		
		//num[0] 배열에 369 대신에 '짝' 문자열을 저장
		for(int i =0; i<num.length; i++) {
			num[i] = (i + 1)+ "";//문자 숫자 결합이여서 문자로 변환
			temp = "";
			sw = 0;
			
			for(int j=0; j<num[i].length(); j++) {
				if(num[i].charAt(j)=='3' ||num[i].charAt(j)=='6' ||num[i].charAt(j)=='9' ) {
					temp += "짝";
					sw = 1;
				}
			}
			if(sw == 1) num[i] = temp;
		}
		
		//num[]배열에 저장된 값을 10개씩 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
			if((i+1) %10 ==0) System.out.println();
		}
	}
}
